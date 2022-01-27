package dev.leonardpark.emoji.windows.category

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.windows.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray")
class TravelCategory: EmojiCategory {
  companion object {
    private val DATA = listOf(
      Emoji(0x1f697, R.drawable.emoji_windows_1f697),
      Emoji(0x1f695, R.drawable.emoji_windows_1f695),
      Emoji(0x1f699, R.drawable.emoji_windows_1f699),
      Emoji(0x1f68c, R.drawable.emoji_windows_1f68c),
      Emoji(0x1f68e, R.drawable.emoji_windows_1f68e),
      Emoji(0x1f3ce, R.drawable.emoji_windows_1f3ce),
      Emoji(0x1f693, R.drawable.emoji_windows_1f693),
      Emoji(0x1f691, R.drawable.emoji_windows_1f691),
      Emoji(0x1f692, R.drawable.emoji_windows_1f692),
      Emoji(0x1f690, R.drawable.emoji_windows_1f690),
      Emoji(0x1f69a, R.drawable.emoji_windows_1f69a),
      Emoji(0x1f69b, R.drawable.emoji_windows_1f69b),
      Emoji(0x1f69c, R.drawable.emoji_windows_1f69c),
      Emoji(0x1f9af, R.drawable.emoji_windows_1f9af),
      Emoji(0x1f9bd, R.drawable.emoji_windows_1f9bd),
      Emoji(0x1f9bc, R.drawable.emoji_windows_1f9bc),
      Emoji(0x1f6f4, R.drawable.emoji_windows_1f6f4),
      Emoji(0x1f6b2, R.drawable.emoji_windows_1f6b2),
      Emoji(0x1f6f5, R.drawable.emoji_windows_1f6f5),
      Emoji(0x1f3cd, R.drawable.emoji_windows_1f3cd),
      Emoji(0x1f6fa, R.drawable.emoji_windows_1f6fa),
      Emoji(0x1f6a8, R.drawable.emoji_windows_1f6a8),
      Emoji(0x1f694, R.drawable.emoji_windows_1f694),
      Emoji(0x1f68d, R.drawable.emoji_windows_1f68d),
      Emoji(0x1f698, R.drawable.emoji_windows_1f698),
      Emoji(0x1f696, R.drawable.emoji_windows_1f696),
      Emoji(0x1f6a1, R.drawable.emoji_windows_1f6a1),
      Emoji(0x1f6a0, R.drawable.emoji_windows_1f6a0),
      Emoji(0x1f69f, R.drawable.emoji_windows_1f69f),
      Emoji(0x1f683, R.drawable.emoji_windows_1f683),
      Emoji(0x1f68b, R.drawable.emoji_windows_1f68b),
      Emoji(0x1f69e, R.drawable.emoji_windows_1f69e),
      Emoji(0x1f69d, R.drawable.emoji_windows_1f69d),
      Emoji(0x1f684, R.drawable.emoji_windows_1f684),
      Emoji(0x1f685, R.drawable.emoji_windows_1f685),
      Emoji(0x1f688, R.drawable.emoji_windows_1f688),
      Emoji(0x1f682, R.drawable.emoji_windows_1f682),
      Emoji(0x1f686, R.drawable.emoji_windows_1f686),
      Emoji(0x1f687, R.drawable.emoji_windows_1f687),
      Emoji(0x1f68a, R.drawable.emoji_windows_1f68a),
      Emoji(0x1f689, R.drawable.emoji_windows_1f689),
      Emoji(0x2708, R.drawable.emoji_windows_2708),
      Emoji(0x1f6eb, R.drawable.emoji_windows_1f6eb),
      Emoji(0x1f6ec, R.drawable.emoji_windows_1f6ec),
      Emoji(0x1f6e9, R.drawable.emoji_windows_1f6e9),
      Emoji(0x1f4ba, R.drawable.emoji_windows_1f4ba),
      Emoji(0x1f6f0, R.drawable.emoji_windows_1f6f0),
      Emoji(0x1f680, R.drawable.emoji_windows_1f680),
      Emoji(0x1f6f8, R.drawable.emoji_windows_1f6f8),
      Emoji(0x1f681, R.drawable.emoji_windows_1f681),
      Emoji(0x1f6f6, R.drawable.emoji_windows_1f6f6),
      Emoji(0x26f5, R.drawable.emoji_windows_26f5),
      Emoji(0x1f6a4, R.drawable.emoji_windows_1f6a4),
      Emoji(0x1f6e5, R.drawable.emoji_windows_1f6e5),
      Emoji(0x1f6f3, R.drawable.emoji_windows_1f6f3),
      Emoji(0x26f4, R.drawable.emoji_windows_26f4),
      Emoji(0x1f6a2, R.drawable.emoji_windows_1f6a2),
      Emoji(0x2693, R.drawable.emoji_windows_2693),
      Emoji(0x26fd, R.drawable.emoji_windows_26fd),
      Emoji(0x1f6a7, R.drawable.emoji_windows_1f6a7),
      Emoji(0x1f6a6, R.drawable.emoji_windows_1f6a6),
      Emoji(0x1f6a5, R.drawable.emoji_windows_1f6a5),
      Emoji(0x1f68f, R.drawable.emoji_windows_1f68f),
      Emoji(0x1f5fa, R.drawable.emoji_windows_1f5fa),
      Emoji(0x1f5ff, R.drawable.emoji_windows_1f5ff),
      Emoji(0x1f5fd, R.drawable.emoji_windows_1f5fd),
      Emoji(0x1f5fc, R.drawable.emoji_windows_1f5fc),
      Emoji(0x1f3f0, R.drawable.emoji_windows_1f3f0),
      Emoji(0x1f3ef, R.drawable.emoji_windows_1f3ef),
      Emoji(0x1f3df, R.drawable.emoji_windows_1f3df),
      Emoji(0x1f3a1, R.drawable.emoji_windows_1f3a1),
      Emoji(0x1f3a2, R.drawable.emoji_windows_1f3a2),
      Emoji(0x1f3a0, R.drawable.emoji_windows_1f3a0),
      Emoji(0x26f2, R.drawable.emoji_windows_26f2),
      Emoji(0x26f1, R.drawable.emoji_windows_26f1),
      Emoji(0x1f3d6, R.drawable.emoji_windows_1f3d6),
      Emoji(0x1f3dd, R.drawable.emoji_windows_1f3dd),
      Emoji(0x1f3dc, R.drawable.emoji_windows_1f3dc),
      Emoji(0x1f30b, R.drawable.emoji_windows_1f30b),
      Emoji(0x26f0, R.drawable.emoji_windows_26f0),
      Emoji(0x1f3d4, R.drawable.emoji_windows_1f3d4),
      Emoji(0x1f5fb, R.drawable.emoji_windows_1f5fb),
      Emoji(0x1f3d5, R.drawable.emoji_windows_1f3d5),
      Emoji(0x26fa, R.drawable.emoji_windows_26fa),
      Emoji(0x1f3e0, R.drawable.emoji_windows_1f3e0),
      Emoji(0x1f3e1, R.drawable.emoji_windows_1f3e1),
      Emoji(0x1f3d8, R.drawable.emoji_windows_1f3d8),
      Emoji(0x1f3da, R.drawable.emoji_windows_1f3da),
      Emoji(0x1f3d7, R.drawable.emoji_windows_1f3d7),
      Emoji(0x1f3ed, R.drawable.emoji_windows_1f3ed),
      Emoji(0x1f3e2, R.drawable.emoji_windows_1f3e2),
      Emoji(0x1f3ec, R.drawable.emoji_windows_1f3ec),
      Emoji(0x1f3e3, R.drawable.emoji_windows_1f3e3),
      Emoji(0x1f3e4, R.drawable.emoji_windows_1f3e4),
      Emoji(0x1f3e5, R.drawable.emoji_windows_1f3e5),
      Emoji(0x1f3e6, R.drawable.emoji_windows_1f3e6),
      Emoji(0x1f3e8, R.drawable.emoji_windows_1f3e8),
      Emoji(0x1f3ea, R.drawable.emoji_windows_1f3ea),
      Emoji(0x1f3eb, R.drawable.emoji_windows_1f3eb),
      Emoji(0x1f3e9, R.drawable.emoji_windows_1f3e9),
      Emoji(0x1f492, R.drawable.emoji_windows_1f492),
      Emoji(0x1f3db, R.drawable.emoji_windows_1f3db),
      Emoji(0x26ea, R.drawable.emoji_windows_26ea),
      Emoji(0x1f54c, R.drawable.emoji_windows_1f54c),
      Emoji(0x1f54d, R.drawable.emoji_windows_1f54d),
      Emoji(0x1f6d5, R.drawable.emoji_windows_1f6d5),
      Emoji(0x1f54b, R.drawable.emoji_windows_1f54b),
      Emoji(0x26e9, R.drawable.emoji_windows_26e9),
      Emoji(0x1f6e4, R.drawable.emoji_windows_1f6e4),
      Emoji(0x1f6e3, R.drawable.emoji_windows_1f6e3),
      Emoji(0x1f5fe, R.drawable.emoji_windows_1f5fe),
      Emoji(0x1f391, R.drawable.emoji_windows_1f391),
      Emoji(0x1f3de, R.drawable.emoji_windows_1f3de),
      Emoji(0x1f305, R.drawable.emoji_windows_1f305),
      Emoji(0x1f304, R.drawable.emoji_windows_1f304),
      Emoji(0x1f320, R.drawable.emoji_windows_1f320),
      Emoji(0x1f387, R.drawable.emoji_windows_1f387),
      Emoji(0x1f386, R.drawable.emoji_windows_1f386),
      Emoji(0x1f307, R.drawable.emoji_windows_1f307),
      Emoji(0x1f306, R.drawable.emoji_windows_1f306),
      Emoji(0x1f3d9, R.drawable.emoji_windows_1f3d9),
      Emoji(0x1f303, R.drawable.emoji_windows_1f303),
      Emoji(0x1f30c, R.drawable.emoji_windows_1f30c),
      Emoji(0x1f309, R.drawable.emoji_windows_1f309),
      Emoji(0x1f301, R.drawable.emoji_windows_1f301)
    )
  }

  override fun getEmojis(): List<Emoji> = DATA

  override fun getIcon(): Int = R.drawable.emoji_windows_category_travel
}
