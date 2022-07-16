/*
 * Copyright 2018 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.example.bot.spring;

import java.util.Arrays;

import java.util.List;
import java.util.function.Supplier;

import com.linecorp.bot.model.action.CameraAction;
import com.linecorp.bot.model.action.CameraRollAction;
import com.linecorp.bot.model.action.LocationAction;
import com.linecorp.bot.model.action.MessageAction;
import com.linecorp.bot.model.action.PostbackAction;
import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.model.message.quickreply.QuickReply;
import com.linecorp.bot.model.message.quickreply.QuickReplyItem;

import com.example.common.*;

public class MessageWithQuickReplySupplier implements Supplier<Message> {

	@Override
    public Message get() {
        final List<QuickReplyItem> items = Arrays.<QuickReplyItem>asList(
        		QuickReplyItem.builder()
        		.action(new MessageAction(Item.ITM_002, Item.ITM_002))
        		.build(),

        		QuickReplyItem.builder()
        		.action(new MessageAction(Item.ITM_003, Item.ITM_003))
        		.build()
        		);

        final QuickReply quickReply = QuickReply.items(items);

        return TextMessage
                .builder()
                .text(LineMessage.MSG_01)
                .quickReply(quickReply)
                .build();
    }

	/*
	 * 収入か出費か選択
	 */
    public Message selectInOrOut() {
        final List<QuickReplyItem> items = Arrays.<QuickReplyItem>asList(
        		QuickReplyItem.builder()
        		.action(new MessageAction(Item.ITM_002, Item.ITM_002))
        		.build(),

        		QuickReplyItem.builder()
        		.action(new MessageAction(Item.ITM_003, Item.ITM_003))
        		.build()
        		);

        final QuickReply quickReply = QuickReply.items(items);

        return TextMessage
                .builder()
                .text(LineMessage.MSG_01)
                .quickReply(quickReply)
                .build();
    }

    /*
     * 収入項目を選択する
     */
    public Message selectItem_Input() {
        final List<QuickReplyItem> items = Arrays.<QuickReplyItem>asList(

        		QuickReplyItem.builder().action(new MessageAction(Item.ITM_01, Item.ITM_01)).build(),
        		QuickReplyItem.builder().action(new MessageAction(Item.ITM_02, Item.ITM_02)).build(),
        		QuickReplyItem.builder().action(new MessageAction(Item.ITM_03, Item.ITM_03)).build()
        		);

        final QuickReply quickReply = QuickReply.items(items);

        return TextMessage
                .builder()
                .text(LineMessage.MSG_02)
                .quickReply(quickReply)
                .build();
    }

    /*
     * 出費項目を選択する
     */
    public Message selectItem_Output() {
        final List<QuickReplyItem> items = Arrays.<QuickReplyItem>asList(
        		QuickReplyItem.builder().action(new MessageAction(Item.ITM_05, Item.ITM_05)).build(),
        		QuickReplyItem.builder().action(new MessageAction(Item.ITM_06, Item.ITM_06)).build(),
        		QuickReplyItem.builder().action(new MessageAction(Item.ITM_07, Item.ITM_07)).build(),
        		QuickReplyItem.builder().action(new MessageAction(Item.ITM_08, Item.ITM_08)).build(),
        		QuickReplyItem.builder().action(new MessageAction(Item.ITM_09, Item.ITM_09)).build(),
        		QuickReplyItem.builder().action(new MessageAction(Item.ITM_10, Item.ITM_10)).build(),
        		QuickReplyItem.builder().action(new MessageAction(Item.ITM_11, Item.ITM_11)).build(),
        		QuickReplyItem.builder().action(new MessageAction(Item.ITM_12, Item.ITM_12)).build(),
        		QuickReplyItem.builder().action(new MessageAction(Item.ITM_13, Item.ITM_13)).build(),
        		QuickReplyItem.builder().action(new MessageAction(Item.ITM_14, Item.ITM_14)).build(),
        		QuickReplyItem.builder().action(new MessageAction(Item.ITM_15, Item.ITM_15)).build()
        		);

        final QuickReply quickReply = QuickReply.items(items);

        return TextMessage
                .builder()
                .text(LineMessage.MSG_02)
                .quickReply(quickReply)
                .build();
    }

	/*
	 * YesかNoか選択
	 */
    public Message selectYesOrNo() {

        final List<QuickReplyItem> items = Arrays.<QuickReplyItem>asList(
        		QuickReplyItem.builder()
        		.action(new MessageAction(LineMessage.MSG_08, LineMessage.MSG_08))
        		.build(),

        		QuickReplyItem.builder()
        		.action(new MessageAction(LineMessage.MSG_09, LineMessage.MSG_09))
        		.build()
        		);

        final QuickReply quickReply = QuickReply.items(items);

        return TextMessage
                .builder()
                .text(LineMessage.MSG_05)
                .quickReply(quickReply)
                .build();
    }
}
