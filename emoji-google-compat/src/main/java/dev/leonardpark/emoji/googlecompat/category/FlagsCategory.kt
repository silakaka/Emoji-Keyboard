package dev.leonardpark.emoji.googlecompat.category

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.googlecompat.GoogleCompatEmoji
import dev.leonardpark.emoji.googlecompat.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray")
class FlagsCategory: EmojiCategory {
  companion object {
    private val DATA = listOf(
      GoogleCompatEmoji(0x1f3f3),
      GoogleCompatEmoji(0x1f3f4),
      GoogleCompatEmoji(0x1f3c1),
      GoogleCompatEmoji(0x1f6a9),
      GoogleCompatEmoji(intArrayOf(0x1f3f3, 0xfe0f, 0x200d, 0x1f308)),
      GoogleCompatEmoji(intArrayOf(0x1f3f3, 0xfe0f, 0x200d, 0x26a7, 0xfe0f)),
      GoogleCompatEmoji(intArrayOf(0x1f3f4, 0x200d, 0x2620, 0xfe0f)),
      GoogleCompatEmoji(intArrayOf(0x1f1e6, 0x1f1eb)),
      GoogleCompatEmoji(intArrayOf(0x1f1e6, 0x1f1fd)),
      GoogleCompatEmoji(intArrayOf(0x1f1e6, 0x1f1f1)),
      GoogleCompatEmoji(intArrayOf(0x1f1e9, 0x1f1ff)),
      GoogleCompatEmoji(intArrayOf(0x1f1e6, 0x1f1f8)),
      GoogleCompatEmoji(intArrayOf(0x1f1e6, 0x1f1e9)),
      GoogleCompatEmoji(intArrayOf(0x1f1e6, 0x1f1f4)),
      GoogleCompatEmoji(intArrayOf(0x1f1e6, 0x1f1ee)),
      GoogleCompatEmoji(intArrayOf(0x1f1e6, 0x1f1f6)),
      GoogleCompatEmoji(intArrayOf(0x1f1e6, 0x1f1ec)),
      GoogleCompatEmoji(intArrayOf(0x1f1e6, 0x1f1f7)),
      GoogleCompatEmoji(intArrayOf(0x1f1e6, 0x1f1f2)),
      GoogleCompatEmoji(intArrayOf(0x1f1e6, 0x1f1fc)),
      GoogleCompatEmoji(intArrayOf(0x1f1e6, 0x1f1f9)),
      GoogleCompatEmoji(intArrayOf(0x1f1e6, 0x1f1ff)),
      GoogleCompatEmoji(intArrayOf(0x1f1e7, 0x1f1f8)),
      GoogleCompatEmoji(intArrayOf(0x1f1e7, 0x1f1ed)),
      GoogleCompatEmoji(intArrayOf(0x1f1e7, 0x1f1e9)),
      GoogleCompatEmoji(intArrayOf(0x1f1e7, 0x1f1e7)),
      GoogleCompatEmoji(intArrayOf(0x1f1e7, 0x1f1fe)),
      GoogleCompatEmoji(intArrayOf(0x1f1e7, 0x1f1ea)),
      GoogleCompatEmoji(intArrayOf(0x1f1e7, 0x1f1ff)),
      GoogleCompatEmoji(intArrayOf(0x1f1e7, 0x1f1ef)),
      GoogleCompatEmoji(intArrayOf(0x1f1e7, 0x1f1f2)),
      GoogleCompatEmoji(intArrayOf(0x1f1e7, 0x1f1f9)),
      GoogleCompatEmoji(intArrayOf(0x1f1e7, 0x1f1f4)),
      GoogleCompatEmoji(intArrayOf(0x1f1e7, 0x1f1e6)),
      GoogleCompatEmoji(intArrayOf(0x1f1e7, 0x1f1fc)),
      GoogleCompatEmoji(intArrayOf(0x1f1e7, 0x1f1f7)),
      GoogleCompatEmoji(intArrayOf(0x1f1fb, 0x1f1ec)),
      GoogleCompatEmoji(intArrayOf(0x1f1e7, 0x1f1f3)),
      GoogleCompatEmoji(intArrayOf(0x1f1e7, 0x1f1ec)),
      GoogleCompatEmoji(intArrayOf(0x1f1e7, 0x1f1eb)),
      GoogleCompatEmoji(intArrayOf(0x1f1e7, 0x1f1ee)),
      GoogleCompatEmoji(intArrayOf(0x1f1f0, 0x1f1ed)),
      GoogleCompatEmoji(intArrayOf(0x1f1e8, 0x1f1f2)),
      GoogleCompatEmoji(intArrayOf(0x1f1e8, 0x1f1e6)),
      GoogleCompatEmoji(intArrayOf(0x1f1ee, 0x1f1e8)),
      GoogleCompatEmoji(intArrayOf(0x1f1e8, 0x1f1fb)),
      GoogleCompatEmoji(intArrayOf(0x1f1f0, 0x1f1fe)),
      GoogleCompatEmoji(intArrayOf(0x1f1e8, 0x1f1eb)),
      GoogleCompatEmoji(intArrayOf(0x1f1f9, 0x1f1e9)),
      GoogleCompatEmoji(intArrayOf(0x1f1e8, 0x1f1f1)),
      GoogleCompatEmoji(intArrayOf(0x1f1e8, 0x1f1f3)),
      GoogleCompatEmoji(intArrayOf(0x1f1e8, 0x1f1fd)),
      GoogleCompatEmoji(intArrayOf(0x1f1e8, 0x1f1e8)),
      GoogleCompatEmoji(intArrayOf(0x1f1e8, 0x1f1f4)),
      GoogleCompatEmoji(intArrayOf(0x1f1f0, 0x1f1f2)),
      GoogleCompatEmoji(intArrayOf(0x1f1e8, 0x1f1ec)),
      GoogleCompatEmoji(intArrayOf(0x1f1e8, 0x1f1e9)),
      GoogleCompatEmoji(intArrayOf(0x1f1e8, 0x1f1f0)),
      GoogleCompatEmoji(intArrayOf(0x1f1e8, 0x1f1f7)),
      GoogleCompatEmoji(intArrayOf(0x1f1e8, 0x1f1ee)),
      GoogleCompatEmoji(intArrayOf(0x1f1ed, 0x1f1f7)),
      GoogleCompatEmoji(intArrayOf(0x1f1e8, 0x1f1fa)),
      GoogleCompatEmoji(intArrayOf(0x1f1e8, 0x1f1fc)),
      GoogleCompatEmoji(intArrayOf(0x1f1e8, 0x1f1fe)),
      GoogleCompatEmoji(intArrayOf(0x1f1e8, 0x1f1ff)),
      GoogleCompatEmoji(intArrayOf(0x1f1e9, 0x1f1f0)),
      GoogleCompatEmoji(intArrayOf(0x1f1e9, 0x1f1ef)),
      GoogleCompatEmoji(intArrayOf(0x1f1e9, 0x1f1f2)),
      GoogleCompatEmoji(intArrayOf(0x1f1e9, 0x1f1f4)),
      GoogleCompatEmoji(intArrayOf(0x1f1ea, 0x1f1e8)),
      GoogleCompatEmoji(intArrayOf(0x1f1ea, 0x1f1ec)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1fb)),
      GoogleCompatEmoji(intArrayOf(0x1f1ec, 0x1f1f6)),
      GoogleCompatEmoji(intArrayOf(0x1f1ea, 0x1f1f7)),
      GoogleCompatEmoji(intArrayOf(0x1f1ea, 0x1f1ea)),
      GoogleCompatEmoji(intArrayOf(0x1f1ea, 0x1f1f9)),
      GoogleCompatEmoji(intArrayOf(0x1f1ea, 0x1f1fa)),
      GoogleCompatEmoji(intArrayOf(0x1f1eb, 0x1f1f4)),
      GoogleCompatEmoji(intArrayOf(0x1f1eb, 0x1f1ef)),
      GoogleCompatEmoji(intArrayOf(0x1f1eb, 0x1f1ee)),
      GoogleCompatEmoji(intArrayOf(0x1f1eb, 0x1f1f7)),
      GoogleCompatEmoji(intArrayOf(0x1f1f5, 0x1f1eb)),
      GoogleCompatEmoji(intArrayOf(0x1f1ec, 0x1f1e6)),
      GoogleCompatEmoji(intArrayOf(0x1f1ec, 0x1f1f2)),
      GoogleCompatEmoji(intArrayOf(0x1f1ec, 0x1f1ea)),
      GoogleCompatEmoji(intArrayOf(0x1f1e9, 0x1f1ea)),
      GoogleCompatEmoji(intArrayOf(0x1f1ec, 0x1f1ed)),
      GoogleCompatEmoji(intArrayOf(0x1f1ec, 0x1f1ee)),
      GoogleCompatEmoji(intArrayOf(0x1f1ec, 0x1f1f7)),
      GoogleCompatEmoji(intArrayOf(0x1f1ec, 0x1f1f1)),
      GoogleCompatEmoji(intArrayOf(0x1f1ec, 0x1f1e9)),
      GoogleCompatEmoji(intArrayOf(0x1f1ec, 0x1f1fa)),
      GoogleCompatEmoji(intArrayOf(0x1f1ec, 0x1f1f9)),
      GoogleCompatEmoji(intArrayOf(0x1f1ec, 0x1f1ec)),
      GoogleCompatEmoji(intArrayOf(0x1f1ec, 0x1f1f3)),
      GoogleCompatEmoji(intArrayOf(0x1f1ec, 0x1f1fc)),
      GoogleCompatEmoji(intArrayOf(0x1f1ec, 0x1f1fe)),
      GoogleCompatEmoji(intArrayOf(0x1f1ed, 0x1f1f9)),
      GoogleCompatEmoji(intArrayOf(0x1f1ed, 0x1f1f3)),
      GoogleCompatEmoji(intArrayOf(0x1f1ed, 0x1f1f0)),
      GoogleCompatEmoji(intArrayOf(0x1f1ed, 0x1f1fa)),
      GoogleCompatEmoji(intArrayOf(0x1f1ee, 0x1f1f8)),
      GoogleCompatEmoji(intArrayOf(0x1f1ee, 0x1f1f3)),
      GoogleCompatEmoji(intArrayOf(0x1f1ee, 0x1f1e9)),
      GoogleCompatEmoji(intArrayOf(0x1f1ee, 0x1f1f7)),
      GoogleCompatEmoji(intArrayOf(0x1f1ee, 0x1f1f6)),
      GoogleCompatEmoji(intArrayOf(0x1f1ee, 0x1f1ea)),
      GoogleCompatEmoji(intArrayOf(0x1f1ee, 0x1f1f2)),
      GoogleCompatEmoji(intArrayOf(0x1f1ee, 0x1f1f1)),
      GoogleCompatEmoji(intArrayOf(0x1f1ee, 0x1f1f9)),
      GoogleCompatEmoji(intArrayOf(0x1f1ef, 0x1f1f2)),
      GoogleCompatEmoji(intArrayOf(0x1f1ef, 0x1f1f5)),
      GoogleCompatEmoji(0x1f38c),
      GoogleCompatEmoji(intArrayOf(0x1f1ef, 0x1f1ea)),
      GoogleCompatEmoji(intArrayOf(0x1f1ef, 0x1f1f4)),
      GoogleCompatEmoji(intArrayOf(0x1f1f0, 0x1f1ff)),
      GoogleCompatEmoji(intArrayOf(0x1f1f0, 0x1f1ea)),
      GoogleCompatEmoji(intArrayOf(0x1f1f0, 0x1f1ee)),
      GoogleCompatEmoji(intArrayOf(0x1f1f0, 0x1f1fc)),
      GoogleCompatEmoji(intArrayOf(0x1f1f0, 0x1f1ec)),
      GoogleCompatEmoji(intArrayOf(0x1f1f1, 0x1f1e6)),
      GoogleCompatEmoji(intArrayOf(0x1f1f1, 0x1f1fb)),
      GoogleCompatEmoji(intArrayOf(0x1f1f1, 0x1f1e7)),
      GoogleCompatEmoji(intArrayOf(0x1f1f1, 0x1f1f8)),
      GoogleCompatEmoji(intArrayOf(0x1f1f1, 0x1f1f7)),
      GoogleCompatEmoji(intArrayOf(0x1f1f1, 0x1f1fe)),
      GoogleCompatEmoji(intArrayOf(0x1f1f1, 0x1f1ee)),
      GoogleCompatEmoji(intArrayOf(0x1f1f1, 0x1f1f9)),
      GoogleCompatEmoji(intArrayOf(0x1f1f1, 0x1f1fa)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1f4)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1f0)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1ec)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1fc)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1fe)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1fb)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1f1)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1f9)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1ed)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1f7)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1fa)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1fd)),
      GoogleCompatEmoji(intArrayOf(0x1f1eb, 0x1f1f2)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1e9)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1e8)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1f3)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1ea)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1f8)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1e6)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1ff)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1f2)),
      GoogleCompatEmoji(intArrayOf(0x1f1f3, 0x1f1e6)),
      GoogleCompatEmoji(intArrayOf(0x1f1f3, 0x1f1f7)),
      GoogleCompatEmoji(intArrayOf(0x1f1f3, 0x1f1f5)),
      GoogleCompatEmoji(intArrayOf(0x1f1f3, 0x1f1f1)),
      GoogleCompatEmoji(intArrayOf(0x1f1f3, 0x1f1ff)),
      GoogleCompatEmoji(intArrayOf(0x1f1f3, 0x1f1ee)),
      GoogleCompatEmoji(intArrayOf(0x1f1f3, 0x1f1ea)),
      GoogleCompatEmoji(intArrayOf(0x1f1f3, 0x1f1ec)),
      GoogleCompatEmoji(intArrayOf(0x1f1f3, 0x1f1fa)),
      GoogleCompatEmoji(intArrayOf(0x1f1f3, 0x1f1eb)),
      GoogleCompatEmoji(intArrayOf(0x1f1f0, 0x1f1f5)),
      GoogleCompatEmoji(intArrayOf(0x1f1f2, 0x1f1f5)),
      GoogleCompatEmoji(intArrayOf(0x1f1f4, 0x1f1f2)),
      GoogleCompatEmoji(intArrayOf(0x1f1f5, 0x1f1f0)),
      GoogleCompatEmoji(intArrayOf(0x1f1f5, 0x1f1fc)),
      GoogleCompatEmoji(intArrayOf(0x1f1f5, 0x1f1f8)),
      GoogleCompatEmoji(intArrayOf(0x1f1f5, 0x1f1e6)),
      GoogleCompatEmoji(intArrayOf(0x1f1f5, 0x1f1ec)),
      GoogleCompatEmoji(intArrayOf(0x1f1f5, 0x1f1fe)),
      GoogleCompatEmoji(intArrayOf(0x1f1f5, 0x1f1ea)),
      GoogleCompatEmoji(intArrayOf(0x1f1f5, 0x1f1ed)),
      GoogleCompatEmoji(intArrayOf(0x1f1f5, 0x1f1f3)),
      GoogleCompatEmoji(intArrayOf(0x1f1f5, 0x1f1f1)),
      GoogleCompatEmoji(intArrayOf(0x1f1f5, 0x1f1f9)),
      GoogleCompatEmoji(intArrayOf(0x1f1f5, 0x1f1f7)),
      GoogleCompatEmoji(intArrayOf(0x1f1f6, 0x1f1e6)),
      GoogleCompatEmoji(intArrayOf(0x1f1f7, 0x1f1f4)),
      GoogleCompatEmoji(intArrayOf(0x1f1f7, 0x1f1fa)),
      GoogleCompatEmoji(intArrayOf(0x1f1f7, 0x1f1fc)),
      GoogleCompatEmoji(intArrayOf(0x1f1fc, 0x1f1f8)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1f2)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1f9)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1e6)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1f3)),
      GoogleCompatEmoji(intArrayOf(0x1f1f7, 0x1f1f8)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1e8)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1f1)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1ec)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1fd)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1f0)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1ee)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1e7)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1f4)),
      GoogleCompatEmoji(intArrayOf(0x1f1ff, 0x1f1e6)),
      GoogleCompatEmoji(intArrayOf(0x1f1f0, 0x1f1f7)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1f8)),
      GoogleCompatEmoji(intArrayOf(0x1f1f1, 0x1f1f0)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1ed)),
      GoogleCompatEmoji(intArrayOf(0x1f1f0, 0x1f1f3)),
      GoogleCompatEmoji(intArrayOf(0x1f1f1, 0x1f1e8)),
      GoogleCompatEmoji(intArrayOf(0x1f1fb, 0x1f1e8)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1e9)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1f7)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1ff)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1ea)),
      GoogleCompatEmoji(intArrayOf(0x1f1e8, 0x1f1ed)),
      GoogleCompatEmoji(intArrayOf(0x1f1f8, 0x1f1fe)),
      GoogleCompatEmoji(intArrayOf(0x1f1f9, 0x1f1fc)),
      GoogleCompatEmoji(intArrayOf(0x1f1f9, 0x1f1ef)),
      GoogleCompatEmoji(intArrayOf(0x1f1f9, 0x1f1ff)),
      GoogleCompatEmoji(intArrayOf(0x1f1f9, 0x1f1ed)),
      GoogleCompatEmoji(intArrayOf(0x1f1f9, 0x1f1f1)),
      GoogleCompatEmoji(intArrayOf(0x1f1f9, 0x1f1ec)),
      GoogleCompatEmoji(intArrayOf(0x1f1f9, 0x1f1f0)),
      GoogleCompatEmoji(intArrayOf(0x1f1f9, 0x1f1f4)),
      GoogleCompatEmoji(intArrayOf(0x1f1f9, 0x1f1f9)),
      GoogleCompatEmoji(intArrayOf(0x1f1f9, 0x1f1f3)),
      GoogleCompatEmoji(intArrayOf(0x1f1f9, 0x1f1f7)),
      GoogleCompatEmoji(intArrayOf(0x1f1f9, 0x1f1f2)),
      GoogleCompatEmoji(intArrayOf(0x1f1f9, 0x1f1e8)),
      GoogleCompatEmoji(intArrayOf(0x1f1fb, 0x1f1ee)),
      GoogleCompatEmoji(intArrayOf(0x1f1f9, 0x1f1fb)),
      GoogleCompatEmoji(intArrayOf(0x1f1fa, 0x1f1ec)),
      GoogleCompatEmoji(intArrayOf(0x1f1fa, 0x1f1e6)),
      GoogleCompatEmoji(intArrayOf(0x1f1e6, 0x1f1ea)),
      GoogleCompatEmoji(intArrayOf(0x1f1ec, 0x1f1e7)),
      GoogleCompatEmoji(intArrayOf(0x1f3f4, 0xe0067, 0xe0062, 0xe0065, 0xe006e, 0xe0067, 0xe007f)),
      GoogleCompatEmoji(intArrayOf(0x1f3f4, 0xe0067, 0xe0062, 0xe0073, 0xe0063, 0xe0074, 0xe007f)),
      GoogleCompatEmoji(intArrayOf(0x1f3f4, 0xe0067, 0xe0062, 0xe0077, 0xe006c, 0xe0073, 0xe007f)),
      GoogleCompatEmoji(intArrayOf(0x1f1fa, 0x1f1fe)),
      GoogleCompatEmoji(intArrayOf(0x1f1fa, 0x1f1ff)),
      GoogleCompatEmoji(intArrayOf(0x1f1fb, 0x1f1fa)),
      GoogleCompatEmoji(intArrayOf(0x1f1fb, 0x1f1e6)),
      GoogleCompatEmoji(intArrayOf(0x1f1fb, 0x1f1ea)),
      GoogleCompatEmoji(intArrayOf(0x1f1fb, 0x1f1f3)),
      GoogleCompatEmoji(intArrayOf(0x1f1fe, 0x1f1ea)),
      GoogleCompatEmoji(intArrayOf(0x1f1ff, 0x1f1f2)),
      GoogleCompatEmoji(intArrayOf(0x1f1ff, 0x1f1fc)),
      GoogleCompatEmoji(intArrayOf(0x1f1e6, 0x1f1e8)),
      GoogleCompatEmoji(intArrayOf(0x1f1fa, 0x1f1f3))
    )
  }

  override fun getEmojis(): List<Emoji> = DATA

  override fun getIcon(): Int = R.drawable.emoji_googlecompat_category_flags
}
