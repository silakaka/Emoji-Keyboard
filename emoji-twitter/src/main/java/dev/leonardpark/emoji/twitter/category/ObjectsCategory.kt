package dev.leonardpark.emoji.twitter.category

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.twitter.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray")
class ObjectsCategory: EmojiCategory {
  companion object {
    private val DATA = listOf(
      Emoji(0x231a, R.drawable.emoji_twitter_231a),
      Emoji(0x1f4f1, R.drawable.emoji_twitter_1f4f1),
      Emoji(0x1f4f2, R.drawable.emoji_twitter_1f4f2),
      Emoji(0x1f4bb, R.drawable.emoji_twitter_1f4bb),
      Emoji(0x2328, R.drawable.emoji_twitter_2328),
      Emoji(0x1f5a5, R.drawable.emoji_twitter_1f5a5),
      Emoji(0x1f5a8, R.drawable.emoji_twitter_1f5a8),
      Emoji(0x1f5b1, R.drawable.emoji_twitter_1f5b1),
      Emoji(0x1f5b2, R.drawable.emoji_twitter_1f5b2),
      Emoji(0x1f579, R.drawable.emoji_twitter_1f579),
      Emoji(0x1f5dc, R.drawable.emoji_twitter_1f5dc),
      Emoji(0x1f4bd, R.drawable.emoji_twitter_1f4bd),
      Emoji(0x1f4be, R.drawable.emoji_twitter_1f4be),
      Emoji(0x1f4bf, R.drawable.emoji_twitter_1f4bf),
      Emoji(0x1f4c0, R.drawable.emoji_twitter_1f4c0),
      Emoji(0x1f4fc, R.drawable.emoji_twitter_1f4fc),
      Emoji(0x1f4f7, R.drawable.emoji_twitter_1f4f7),
      Emoji(0x1f4f8, R.drawable.emoji_twitter_1f4f8),
      Emoji(0x1f4f9, R.drawable.emoji_twitter_1f4f9),
      Emoji(0x1f3a5, R.drawable.emoji_twitter_1f3a5),
      Emoji(0x1f4fd, R.drawable.emoji_twitter_1f4fd),
      Emoji(0x1f39e, R.drawable.emoji_twitter_1f39e),
      Emoji(0x1f4de, R.drawable.emoji_twitter_1f4de),
      Emoji(0x260e, R.drawable.emoji_twitter_260e),
      Emoji(0x1f4df, R.drawable.emoji_twitter_1f4df),
      Emoji(0x1f4e0, R.drawable.emoji_twitter_1f4e0),
      Emoji(0x1f4fa, R.drawable.emoji_twitter_1f4fa),
      Emoji(0x1f4fb, R.drawable.emoji_twitter_1f4fb),
      Emoji(0x1f399, R.drawable.emoji_twitter_1f399),
      Emoji(0x1f39a, R.drawable.emoji_twitter_1f39a),
      Emoji(0x1f39b, R.drawable.emoji_twitter_1f39b),
      Emoji(0x1f9ed, R.drawable.emoji_twitter_1f9ed),
      Emoji(0x23f1, R.drawable.emoji_twitter_23f1),
      Emoji(0x23f2, R.drawable.emoji_twitter_23f2),
      Emoji(0x23f0, R.drawable.emoji_twitter_23f0),
      Emoji(0x1f570, R.drawable.emoji_twitter_1f570),
      Emoji(0x231b, R.drawable.emoji_twitter_231b),
      Emoji(0x23f3, R.drawable.emoji_twitter_23f3),
      Emoji(0x1f4e1, R.drawable.emoji_twitter_1f4e1),
      Emoji(0x1f50b, R.drawable.emoji_twitter_1f50b),
      Emoji(0x1f50c, R.drawable.emoji_twitter_1f50c),
      Emoji(0x1f4a1, R.drawable.emoji_twitter_1f4a1),
      Emoji(0x1f526, R.drawable.emoji_twitter_1f526),
      Emoji(0x1f56f, R.drawable.emoji_twitter_1f56f),
      Emoji(0x1fa94, R.drawable.emoji_twitter_1fa94),
      Emoji(0x1f9ef, R.drawable.emoji_twitter_1f9ef),
      Emoji(0x1f6e2, R.drawable.emoji_twitter_1f6e2),
      Emoji(0x1f4b8, R.drawable.emoji_twitter_1f4b8),
      Emoji(0x1f4b5, R.drawable.emoji_twitter_1f4b5),
      Emoji(0x1f4b4, R.drawable.emoji_twitter_1f4b4),
      Emoji(0x1f4b6, R.drawable.emoji_twitter_1f4b6),
      Emoji(0x1f4b7, R.drawable.emoji_twitter_1f4b7),
      Emoji(0x1fa99, R.drawable.emoji_twitter_1fa99),
      Emoji(0x1f4b0, R.drawable.emoji_twitter_1f4b0),
      Emoji(0x1f4b3, R.drawable.emoji_twitter_1f4b3),
      Emoji(0x1f48e, R.drawable.emoji_twitter_1f48e),
      Emoji(0x2696, R.drawable.emoji_twitter_2696),
      Emoji(0x1fa9c, R.drawable.emoji_twitter_1fa9c),
      Emoji(0x1f9f0, R.drawable.emoji_twitter_1f9f0),
      Emoji(0x1fa9b, R.drawable.emoji_twitter_1fa9b),
      Emoji(0x1f527, R.drawable.emoji_twitter_1f527),
      Emoji(0x1f528, R.drawable.emoji_twitter_1f528),
      Emoji(0x2692, R.drawable.emoji_twitter_2692),
      Emoji(0x1f6e0, R.drawable.emoji_twitter_1f6e0),
      Emoji(0x26cf, R.drawable.emoji_twitter_26cf),
      Emoji(0x1f529, R.drawable.emoji_twitter_1f529),
      Emoji(0x2699, R.drawable.emoji_twitter_2699),
      Emoji(0x1f9f1, R.drawable.emoji_twitter_1f9f1),
      Emoji(0x26d3, R.drawable.emoji_twitter_26d3),
      Emoji(0x1fa9d, R.drawable.emoji_twitter_1fa9d),
      Emoji(0x1faa2, R.drawable.emoji_twitter_1faa2),
      Emoji(0x1f9f2, R.drawable.emoji_twitter_1f9f2),
      Emoji(0x1f52b, R.drawable.emoji_twitter_1f52b),
      Emoji(0x1f4a3, R.drawable.emoji_twitter_1f4a3),
      Emoji(0x1f9e8, R.drawable.emoji_twitter_1f9e8),
      Emoji(0x1fa93, R.drawable.emoji_twitter_1fa93),
      Emoji(0x1fa9a, R.drawable.emoji_twitter_1fa9a),
      Emoji(0x1f52a, R.drawable.emoji_twitter_1f52a),
      Emoji(0x1f5e1, R.drawable.emoji_twitter_1f5e1),
      Emoji(0x2694, R.drawable.emoji_twitter_2694),
      Emoji(0x1f6e1, R.drawable.emoji_twitter_1f6e1),
      Emoji(0x1f6ac, R.drawable.emoji_twitter_1f6ac),
      Emoji(0x26b0, R.drawable.emoji_twitter_26b0),
      Emoji(0x1faa6, R.drawable.emoji_twitter_1faa6),
      Emoji(0x26b1, R.drawable.emoji_twitter_26b1),
      Emoji(0x1f3fa, R.drawable.emoji_twitter_1f3fa),
      Emoji(0x1fa84, R.drawable.emoji_twitter_1fa84),
      Emoji(0x1f52e, R.drawable.emoji_twitter_1f52e),
      Emoji(0x1f4ff, R.drawable.emoji_twitter_1f4ff),
      Emoji(0x1f9ff, R.drawable.emoji_twitter_1f9ff),
      Emoji(0x1f488, R.drawable.emoji_twitter_1f488),
      Emoji(0x2697, R.drawable.emoji_twitter_2697),
      Emoji(0x1f52d, R.drawable.emoji_twitter_1f52d),
      Emoji(0x1f52c, R.drawable.emoji_twitter_1f52c),
      Emoji(0x1f573, R.drawable.emoji_twitter_1f573),
      Emoji(0x1fa9f, R.drawable.emoji_twitter_1fa9f),
      Emoji(0x1fa79, R.drawable.emoji_twitter_1fa79),
      Emoji(0x1fa7a, R.drawable.emoji_twitter_1fa7a),
      Emoji(0x1f48a, R.drawable.emoji_twitter_1f48a),
      Emoji(0x1f489, R.drawable.emoji_twitter_1f489),
      Emoji(0x1fa78, R.drawable.emoji_twitter_1fa78),
      Emoji(0x1f9ec, R.drawable.emoji_twitter_1f9ec),
      Emoji(0x1f9a0, R.drawable.emoji_twitter_1f9a0),
      Emoji(0x1f9eb, R.drawable.emoji_twitter_1f9eb),
      Emoji(0x1f9ea, R.drawable.emoji_twitter_1f9ea),
      Emoji(0x1f321, R.drawable.emoji_twitter_1f321),
      Emoji(0x1faa4, R.drawable.emoji_twitter_1faa4),
      Emoji(0x1f9f9, R.drawable.emoji_twitter_1f9f9),
      Emoji(0x1f9fa, R.drawable.emoji_twitter_1f9fa),
      Emoji(0x1faa1, R.drawable.emoji_twitter_1faa1),
      Emoji(0x1f9fb, R.drawable.emoji_twitter_1f9fb),
      Emoji(0x1f6bd, R.drawable.emoji_twitter_1f6bd),
      Emoji(0x1faa0, R.drawable.emoji_twitter_1faa0),
      Emoji(0x1faa3, R.drawable.emoji_twitter_1faa3),
      Emoji(0x1f6b0, R.drawable.emoji_twitter_1f6b0),
      Emoji(0x1f6bf, R.drawable.emoji_twitter_1f6bf),
      Emoji(0x1f6c1, R.drawable.emoji_twitter_1f6c1),
      Emoji(0x1f6c0, R.drawable.emoji_twitter_1f6c0, arrayOf(
        Emoji(intArrayOf(0x1f6c0, 0x1f3fb), R.drawable.emoji_twitter_1f6c0_1f3fb),
        Emoji(intArrayOf(0x1f6c0, 0x1f3fc), R.drawable.emoji_twitter_1f6c0_1f3fc),
        Emoji(intArrayOf(0x1f6c0, 0x1f3fd), R.drawable.emoji_twitter_1f6c0_1f3fd),
        Emoji(intArrayOf(0x1f6c0, 0x1f3fe), R.drawable.emoji_twitter_1f6c0_1f3fe),
        Emoji(intArrayOf(0x1f6c0, 0x1f3ff), R.drawable.emoji_twitter_1f6c0_1f3ff)
      )),
      Emoji(0x1faa5, R.drawable.emoji_twitter_1faa5),
      Emoji(0x1f9fc, R.drawable.emoji_twitter_1f9fc),
      Emoji(0x1fa92, R.drawable.emoji_twitter_1fa92),
      Emoji(0x1f9fd, R.drawable.emoji_twitter_1f9fd),
      Emoji(0x1f9f4, R.drawable.emoji_twitter_1f9f4),
      Emoji(0x1f6ce, R.drawable.emoji_twitter_1f6ce),
      Emoji(0x1f511, R.drawable.emoji_twitter_1f511),
      Emoji(0x1f5dd, R.drawable.emoji_twitter_1f5dd),
      Emoji(0x1f6aa, R.drawable.emoji_twitter_1f6aa),
      Emoji(0x1fa91, R.drawable.emoji_twitter_1fa91),
      Emoji(0x1fa9e, R.drawable.emoji_twitter_1fa9e),
      Emoji(0x1f6cb, R.drawable.emoji_twitter_1f6cb),
      Emoji(0x1f6cf, R.drawable.emoji_twitter_1f6cf),
      Emoji(0x1f6cc, R.drawable.emoji_twitter_1f6cc, arrayOf(
        Emoji(intArrayOf(0x1f6cc, 0x1f3fb), R.drawable.emoji_twitter_1f6cc_1f3fb),
        Emoji(intArrayOf(0x1f6cc, 0x1f3fc), R.drawable.emoji_twitter_1f6cc_1f3fc),
        Emoji(intArrayOf(0x1f6cc, 0x1f3fd), R.drawable.emoji_twitter_1f6cc_1f3fd),
        Emoji(intArrayOf(0x1f6cc, 0x1f3fe), R.drawable.emoji_twitter_1f6cc_1f3fe),
        Emoji(intArrayOf(0x1f6cc, 0x1f3ff), R.drawable.emoji_twitter_1f6cc_1f3ff)
      )),
      Emoji(0x1f9f8, R.drawable.emoji_twitter_1f9f8),
      Emoji(0x1f5bc, R.drawable.emoji_twitter_1f5bc),
      Emoji(0x1f6cd, R.drawable.emoji_twitter_1f6cd),
      Emoji(0x1f6d2, R.drawable.emoji_twitter_1f6d2),
      Emoji(0x1f381, R.drawable.emoji_twitter_1f381),
      Emoji(0x1f388, R.drawable.emoji_twitter_1f388),
      Emoji(0x1f38f, R.drawable.emoji_twitter_1f38f),
      Emoji(0x1f380, R.drawable.emoji_twitter_1f380),
      Emoji(0x1f38a, R.drawable.emoji_twitter_1f38a),
      Emoji(0x1f389, R.drawable.emoji_twitter_1f389),
      Emoji(0x1fa85, R.drawable.emoji_twitter_1fa85),
      Emoji(0x1fa86, R.drawable.emoji_twitter_1fa86),
      Emoji(0x1f38e, R.drawable.emoji_twitter_1f38e),
      Emoji(0x1f3ee, R.drawable.emoji_twitter_1f3ee),
      Emoji(0x1f390, R.drawable.emoji_twitter_1f390),
      Emoji(0x1f9e7, R.drawable.emoji_twitter_1f9e7),
      Emoji(0x2709, R.drawable.emoji_twitter_2709),
      Emoji(0x1f4e9, R.drawable.emoji_twitter_1f4e9),
      Emoji(0x1f4e8, R.drawable.emoji_twitter_1f4e8),
      Emoji(0x1f4e7, R.drawable.emoji_twitter_1f4e7),
      Emoji(0x1f48c, R.drawable.emoji_twitter_1f48c),
      Emoji(0x1f4e5, R.drawable.emoji_twitter_1f4e5),
      Emoji(0x1f4e4, R.drawable.emoji_twitter_1f4e4),
      Emoji(0x1f4e6, R.drawable.emoji_twitter_1f4e6),
      Emoji(0x1f3f7, R.drawable.emoji_twitter_1f3f7),
      Emoji(0x1f4ea, R.drawable.emoji_twitter_1f4ea),
      Emoji(0x1f4eb, R.drawable.emoji_twitter_1f4eb),
      Emoji(0x1f4ec, R.drawable.emoji_twitter_1f4ec),
      Emoji(0x1f4ed, R.drawable.emoji_twitter_1f4ed),
      Emoji(0x1f4ee, R.drawable.emoji_twitter_1f4ee),
      Emoji(0x1f4ef, R.drawable.emoji_twitter_1f4ef),
      Emoji(0x1faa7, R.drawable.emoji_twitter_1faa7),
      Emoji(0x1f4dc, R.drawable.emoji_twitter_1f4dc),
      Emoji(0x1f4c3, R.drawable.emoji_twitter_1f4c3),
      Emoji(0x1f4c4, R.drawable.emoji_twitter_1f4c4),
      Emoji(0x1f4d1, R.drawable.emoji_twitter_1f4d1),
      Emoji(0x1f9fe, R.drawable.emoji_twitter_1f9fe),
      Emoji(0x1f4ca, R.drawable.emoji_twitter_1f4ca),
      Emoji(0x1f4c8, R.drawable.emoji_twitter_1f4c8),
      Emoji(0x1f4c9, R.drawable.emoji_twitter_1f4c9),
      Emoji(0x1f5d2, R.drawable.emoji_twitter_1f5d2),
      Emoji(0x1f5d3, R.drawable.emoji_twitter_1f5d3),
      Emoji(0x1f4c6, R.drawable.emoji_twitter_1f4c6),
      Emoji(0x1f4c5, R.drawable.emoji_twitter_1f4c5),
      Emoji(0x1f5d1, R.drawable.emoji_twitter_1f5d1),
      Emoji(0x1f4c7, R.drawable.emoji_twitter_1f4c7),
      Emoji(0x1f5c3, R.drawable.emoji_twitter_1f5c3),
      Emoji(0x1f5f3, R.drawable.emoji_twitter_1f5f3),
      Emoji(0x1f5c4, R.drawable.emoji_twitter_1f5c4),
      Emoji(0x1f4cb, R.drawable.emoji_twitter_1f4cb),
      Emoji(0x1f4c1, R.drawable.emoji_twitter_1f4c1),
      Emoji(0x1f4c2, R.drawable.emoji_twitter_1f4c2),
      Emoji(0x1f5c2, R.drawable.emoji_twitter_1f5c2),
      Emoji(0x1f5de, R.drawable.emoji_twitter_1f5de),
      Emoji(0x1f4f0, R.drawable.emoji_twitter_1f4f0),
      Emoji(0x1f4d3, R.drawable.emoji_twitter_1f4d3),
      Emoji(0x1f4d4, R.drawable.emoji_twitter_1f4d4),
      Emoji(0x1f4d2, R.drawable.emoji_twitter_1f4d2),
      Emoji(0x1f4d5, R.drawable.emoji_twitter_1f4d5),
      Emoji(0x1f4d7, R.drawable.emoji_twitter_1f4d7),
      Emoji(0x1f4d8, R.drawable.emoji_twitter_1f4d8),
      Emoji(0x1f4d9, R.drawable.emoji_twitter_1f4d9),
      Emoji(0x1f4da, R.drawable.emoji_twitter_1f4da),
      Emoji(0x1f4d6, R.drawable.emoji_twitter_1f4d6),
      Emoji(0x1f516, R.drawable.emoji_twitter_1f516),
      Emoji(0x1f9f7, R.drawable.emoji_twitter_1f9f7),
      Emoji(0x1f517, R.drawable.emoji_twitter_1f517),
      Emoji(0x1f4ce, R.drawable.emoji_twitter_1f4ce),
      Emoji(0x1f587, R.drawable.emoji_twitter_1f587),
      Emoji(0x1f4d0, R.drawable.emoji_twitter_1f4d0),
      Emoji(0x1f4cf, R.drawable.emoji_twitter_1f4cf),
      Emoji(0x1f9ee, R.drawable.emoji_twitter_1f9ee),
      Emoji(0x1f4cc, R.drawable.emoji_twitter_1f4cc),
      Emoji(0x1f4cd, R.drawable.emoji_twitter_1f4cd),
      Emoji(0x2702, R.drawable.emoji_twitter_2702),
      Emoji(0x1f58a, R.drawable.emoji_twitter_1f58a),
      Emoji(0x1f58b, R.drawable.emoji_twitter_1f58b),
      Emoji(0x2712, R.drawable.emoji_twitter_2712),
      Emoji(0x1f58c, R.drawable.emoji_twitter_1f58c),
      Emoji(0x1f58d, R.drawable.emoji_twitter_1f58d),
      Emoji(0x1f4dd, R.drawable.emoji_twitter_1f4dd),
      Emoji(0x270f, R.drawable.emoji_twitter_270f),
      Emoji(0x1f50d, R.drawable.emoji_twitter_1f50d),
      Emoji(0x1f50e, R.drawable.emoji_twitter_1f50e),
      Emoji(0x1f50f, R.drawable.emoji_twitter_1f50f),
      Emoji(0x1f510, R.drawable.emoji_twitter_1f510),
      Emoji(0x1f512, R.drawable.emoji_twitter_1f512),
      Emoji(0x1f513, R.drawable.emoji_twitter_1f513)
    )
  }

  override fun getEmojis(): List<Emoji> = DATA

  override fun getIcon(): Int = R.drawable.emoji_twitter_category_objects
}
