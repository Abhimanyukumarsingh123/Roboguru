package com.Example.roboguru.data



data class ChatMesssage(
    val message: String,
    val time: String,
    val isMe: Boolean
)

val listOfMessages = listOf(

    ChatMesssage("Hey! How are you?", "9:00 AM", true),
    ChatMesssage("I'm good. How about you?", "9:01 AM", false),
    ChatMesssage(
        """
        Just trying to stay productive.
        There’s so much to do these days,
        and it feels like I’m always running out of time.
        """.trimIndent(), "9:02 AM", true
    ),
    ChatMesssage("I totally get that. Life gets super busy sometimes.", "9:03 AM", false),
    ChatMesssage(
        """
        By the way, did you finish the project you mentioned earlier?
        I was curious about how that went.
        """.trimIndent(), "9:04 AM", true
    ),
    ChatMesssage("Yes, finally wrapped it up last night.", "9:05 AM", false),
    ChatMesssage("Congrats! That must feel like a huge relief.", "9:06 AM", true),
    ChatMesssage(
        """
        Absolutely!
        I was so stressed about meeting the deadline.
        I can finally breathe a little now.
        """.trimIndent(), "9:07 AM", false
    ),
    ChatMesssage("Have you had a chance to celebrate yet?", "9:08 AM", true),
    ChatMesssage("Not yet. Maybe this weekend.", "9:09 AM", false),
    ChatMesssage(
        """
        That sounds like a good plan.
        You should do something fun and relaxing.
        """.trimIndent(), "9:10 AM", true
    ),
    ChatMesssage("Any recommendations?", "9:11 AM", false),
    ChatMesssage(
        """
        Well, you could go for a nice dinner,
        or maybe watch that movie you've been waiting to see.
        """.trimIndent(), "9:12 AM", true
    ),
    ChatMesssage(
        """
        A dinner sounds nice.
        I haven’t been out in a while.
        """.trimIndent(), "9:13 AM", false
    ),
    ChatMesssage("Perfect! You deserve it.", "9:14 AM", true),
    ChatMesssage(
        """
        By the way, did you hear about the new café that opened downtown?
        It’s supposed to have amazing desserts.
        """.trimIndent(), "9:15 AM", true
    ),
    ChatMesssage("No, I haven’t. Is it any good?", "9:16 AM", false),
    ChatMesssage(
        """
        I haven’t been there yet either,
        but a friend was raving about it.
        We should check it out sometime.
        """.trimIndent(), "9:17 AM", true
    ),
    ChatMesssage("That sounds great. Let’s plan for next week.", "9:18 AM", false),
    ChatMesssage("Next week works for me!", "9:19 AM", true),
    ChatMesssage(
        """
        By the way, I started reading that book you recommended.
        It's so interesting!
        """.trimIndent(), "9:20 AM", true
    ),
    ChatMesssage(
        """
        Oh, which one?
        I’ve recommended a few lately!
        """.trimIndent(), "9:21 AM", false
    ),
    ChatMesssage("The one about personal growth and habits.", "9:22 AM", true),
    ChatMesssage(
        """
        Oh, Atomic Habits!
        Such a good read.
        What part are you on now?
        """.trimIndent(), "9:23 AM", false
    ),
    ChatMesssage(
        """
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        """.trimIndent(), "9:24 AM", true
    ),
    ChatMesssage("That’s one of my favorite chapters. So insightful!", "9:25 AM", false),
    ChatMesssage(
        """
        I agree.
        I’m already trying to implement some of the ideas.
        """.trimIndent(), "9:26 AM", true
    ),
    ChatMesssage(
        """
        That’s awesome!
        Let me know if you see results.
        I’d love to hear about it.
        """.trimIndent(), "9:27 AM", false
    ),
    ChatMesssage("I definitely will!", "9:28 AM", true),
    ChatMesssage(
        """
        Oh, which one?
        I’ve recommended a few lately!
        """.trimIndent(), "9:21 AM", false
    ),
    ChatMesssage("The one about personal growth and habits.", "9:22 AM", true),
    ChatMesssage(
        """
        Oh, Atomic Habits!
        Such a good read.
        What part are you on now?
        """.trimIndent(), "9:23 AM", false
    ),
    ChatMesssage(
        """
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        """.trimIndent(), "9:24 AM", true
    ),
    ChatMesssage("That’s one of my favorite chapters. So insightful!", "9:25 AM", false),
    ChatMesssage(
        """
        I agree.
        I’m already trying to implement some of the ideas.
        """.trimIndent(), "9:26 AM", true
    ),
    ChatMesssage(
        """
        That’s awesome!
        Let me know if you see results.
        I’d love to hear about it.
        """.trimIndent(), "9:27 AM", false
    ),
    ChatMesssage("I definitely will!", "9:28 AM", true),

    ChatMesssage("Yes, finally wrapped it up last night.", "9:05 AM", false),
    ChatMesssage("Congrats! That must feel like a huge relief.", "9:06 AM", true),
    ChatMesssage(
        """
        Absolutely!
        I was so stressed about meeting the deadline.
        I can finally breathe a little now.
        """.trimIndent(), "9:07 AM", false
    ),
    ChatMesssage("Have you had a chance to celebrate yet?", "9:08 AM", true),
    ChatMesssage("Not yet. Maybe this weekend.", "9:09 AM", false),
    ChatMesssage(
        """
        That sounds like a good plan.
        You should do something fun and relaxing.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        """.trimIndent(), "9:10 AM", true
    ),
    ChatMesssage("Any recommendations?", "9:11 AM", false),
    ChatMesssage(
        """
        Well, you could go for a nice dinner,
        or maybe watch that movie you've been waiting to see.
        """.trimIndent(), "9:12 AM", true
    ),

    ChatMesssage(
        """
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        """.trimIndent(), "9:24 AM", true
    ),
    ChatMesssage("That’s one of my favorite chapters. So insightful!", "9:25 AM", false),
    ChatMesssage(
        """
        I agree.
        I’m already trying to implement some of the ideas.
        """.trimIndent(), "9:26 AM", true
    ),
    ChatMesssage(
        """
        That’s awesome!
        Let me know if you see results.
        I’d love to hear about it.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        """.trimIndent(), "9:27 AM", false
    ),

    ChatMesssage(
        """
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        I just finished the chapter on building systems.
        It’s really changing how I think about routines.
        """.trimIndent(), "9:24 AM", true
    ),
    ChatMesssage("That’s one of my favorite chapters. So insightful!", "9:25 AM", false),
    ChatMesssage(
        """
        I agree.
        I’m already trying to implement some of the ideas.
        """.trimIndent(), "9:26 AM", true
    ),
    ChatMesssage(
        """
        That’s awesome!
        Let me know if you see results.
        I’d love to hear about it.
        """.trimIndent(), "9:27 AM", false
    ),
    ChatMesssage("I definitely will!", "9:28 AM", true),
// Add more messages to fill up to 150 lines, varying lengths as required.
    ChatMesssage("Let’s talk later.", "9:29 AM", true),
    ChatMesssage("Sure. Take care!", "9:30 AM", false)


).reversed()