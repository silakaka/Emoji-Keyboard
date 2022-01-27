package dev.leonardpark.emoji.googlecompat.category

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.googlecompat.GoogleCompatEmoji
import dev.leonardpark.emoji.googlecompat.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray")
class TravelCategory: EmojiCategory {
  companion object {
    private val DATA = listOf(
      GoogleCompatEmoji(0x1f697),
      GoogleCompatEmoji(0x1f695),
      GoogleCompatEmoji(0x1f699),
      GoogleCompatEmoji(0x1f6fb),
      GoogleCompatEmoji(0x1f68c),
      GoogleCompatEmoji(0x1f68e),
      GoogleCompatEmoji(0x1f3ce),
      GoogleCompatEmoji(0x1f693),
      GoogleCompatEmoji(0x1f691),
      GoogleCompatEmoji(0x1f692),
      GoogleCompatEmoji(0x1f690),
      GoogleCompatEmoji(0x1f69a),
      GoogleCompatEmoji(0x1f69b),
      GoogleCompatEmoji(0x1f69c),
      GoogleCompatEmoji(0x1f9af),
      GoogleCompatEmoji(0x1f9bd),
      GoogleCompatEmoji(0x1f9bc),
      GoogleCompatEmoji(0x1f6f4),
      GoogleCompatEmoji(0x1f6b2),
      GoogleCompatEmoji(0x1f6f5),
      GoogleCompatEmoji(0x1f3cd),
      GoogleCompatEmoji(0x1f6fa),
      GoogleCompatEmoji(0x1f6a8),
      GoogleCompatEmoji(0x1f694),
      GoogleCompatEmoji(0x1f68d),
      GoogleCompatEmoji(0x1f698),
      GoogleCompatEmoji(0x1f696),
      GoogleCompatEmoji(0x1f6a1),
      GoogleCompatEmoji(0x1f6a0),
      GoogleCompatEmoji(0x1f69f),
      GoogleCompatEmoji(0x1f683),
      GoogleCompatEmoji(0x1f68b),
      GoogleCompatEmoji(0x1f69e),
      GoogleCompatEmoji(0x1f69d),
      GoogleCompatEmoji(0x1f684),
      GoogleCompatEmoji(0x1f685),
      GoogleCompatEmoji(0x1f688),
      GoogleCompatEmoji(0x1f682),
      GoogleCompatEmoji(0x1f686),
      GoogleCompatEmoji(0x1f687),
      GoogleCompatEmoji(0x1f68a),
      GoogleCompatEmoji(0x1f689),
      GoogleCompatEmoji(0x2708),
      GoogleCompatEmoji(0x1f6eb),
      GoogleCompatEmoji(0x1f6ec),
      GoogleCompatEmoji(0x1f6e9),
      GoogleCompatEmoji(0x1f4ba),
      GoogleCompatEmoji(0x1f6f0),
      GoogleCompatEmoji(0x1f680),
      GoogleCompatEmoji(0x1f6f8),
      GoogleCompatEmoji(0x1f681),
      GoogleCompatEmoji(0x1f6f6),
      GoogleCompatEmoji(0x26f5),
      GoogleCompatEmoji(0x1f6a4),
      GoogleCompatEmoji(0x1f6e5),
      GoogleCompatEmoji(0x1f6f3),
      GoogleCompatEmoji(0x26f4),
      GoogleCompatEmoji(0x1f6a2),
      GoogleCompatEmoji(0x2693),
      GoogleCompatEmoji(0x26fd),
      GoogleCompatEmoji(0x1f6a7),
      GoogleCompatEmoji(0x1f6a6),
      GoogleCompatEmoji(0x1f6a5),
      GoogleCompatEmoji(0x1f68f),
      GoogleCompatEmoji(0x1f5fa),
      GoogleCompatEmoji(0x1f5ff),
      GoogleCompatEmoji(0x1f5fd),
      GoogleCompatEmoji(0x1f5fc),
      GoogleCompatEmoji(0x1f3f0),
      GoogleCompatEmoji(0x1f3ef),
      GoogleCompatEmoji(0x1f3df),
      GoogleCompatEmoji(0x1f3a1),
      GoogleCompatEmoji(0x1f3a2),
      GoogleCompatEmoji(0x1f3a0),
      GoogleCompatEmoji(0x26f2),
      GoogleCompatEmoji(0x26f1),
      GoogleCompatEmoji(0x1f3d6),
      GoogleCompatEmoji(0x1f3dd),
      GoogleCompatEmoji(0x1f3dc),
      GoogleCompatEmoji(0x1f30b),
      GoogleCompatEmoji(0x26f0),
      GoogleCompatEmoji(0x1f3d4),
      GoogleCompatEmoji(0x1f5fb),
      GoogleCompatEmoji(0x1f3d5),
      GoogleCompatEmoji(0x26fa),
      GoogleCompatEmoji(0x1f3e0),
      GoogleCompatEmoji(0x1f3e1),
      GoogleCompatEmoji(0x1f3d8),
      GoogleCompatEmoji(0x1f3da),
      GoogleCompatEmoji(0x1f6d6),
      GoogleCompatEmoji(0x1f3d7),
      GoogleCompatEmoji(0x1f3ed),
      GoogleCompatEmoji(0x1f3e2),
      GoogleCompatEmoji(0x1f3ec),
      GoogleCompatEmoji(0x1f3e3),
      GoogleCompatEmoji(0x1f3e4),
      GoogleCompatEmoji(0x1f3e5),
      GoogleCompatEmoji(0x1f3e6),
      GoogleCompatEmoji(0x1f3e8),
      GoogleCompatEmoji(0x1f3ea),
      GoogleCompatEmoji(0x1f3eb),
      GoogleCompatEmoji(0x1f3e9),
      GoogleCompatEmoji(0x1f492),
      GoogleCompatEmoji(0x1f3db),
      GoogleCompatEmoji(0x26ea),
      GoogleCompatEmoji(0x1f54c),
      GoogleCompatEmoji(0x1f54d),
      GoogleCompatEmoji(0x1f6d5),
      GoogleCompatEmoji(0x1f54b),
      GoogleCompatEmoji(0x26e9),
      GoogleCompatEmoji(0x1f6e4),
      GoogleCompatEmoji(0x1f6e3),
      GoogleCompatEmoji(0x1f5fe),
      GoogleCompatEmoji(0x1f391),
      GoogleCompatEmoji(0x1f3de),
      GoogleCompatEmoji(0x1f305),
      GoogleCompatEmoji(0x1f304),
      GoogleCompatEmoji(0x1f320),
      GoogleCompatEmoji(0x1f387),
      GoogleCompatEmoji(0x1f386),
      GoogleCompatEmoji(0x1f307),
      GoogleCompatEmoji(0x1f306),
      GoogleCompatEmoji(0x1f3d9),
      GoogleCompatEmoji(0x1f303),
      GoogleCompatEmoji(0x1f30c),
      GoogleCompatEmoji(0x1f309),
      GoogleCompatEmoji(0x1f301)
    )
  }

  override fun getEmojis(): List<Emoji> = DATA

  override fun getIcon(): Int = R.drawable.emoji_googlecompat_category_travel
}
