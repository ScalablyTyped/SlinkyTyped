package typingsSlinky.zxcvbn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZXCVBNSequence extends js.Object {
  /**
    * if sequence is ascending.
    */
  var ascending: Boolean = js.native
  /**
    * the base number of guesses.
    */
  var base_guesses: Double = js.native
  /**
    * the base match to relate to.
    */
  var base_matches: String = js.native
  /**
    * the base token to relate to.
    */
  var base_token: String = js.native
  /**
    * the dictionary this sequence was found in.
    */
  var dictionary_name: String = js.native
  /**
    * estimated guesses needed to crack sequence.
    */
  var guesses: Double = js.native
  /**
    * order of magnitude of guesses.
    */
  var guesses_log10: Double = js.native
  /**
    * sequence index.
    */
  var i: Double = js.native
  /**
    * sequence section number.
    */
  var j: Double = js.native
  /**
    * is part of l33t speak.
    */
  var l33t: Boolean = js.native
  /**
    * how many variations of l33t speak.
    */
  var l33t_variations: Double = js.native
  /**
    * the word that was matched in dictionary.
    */
  var matched_word: String = js.native
  /**
    * what type of pattern the sequence contains.
    */
  var pattern: String = js.native
  /**
    * the rank of the sequence in the dictionary.
    */
  var rank: Double = js.native
  /**
    * how many times the sequence is repeated.
    */
  var repeat_count: Double = js.native
  /**
    * is reveresed.
    */
  var reversed: Boolean = js.native
  /**
    * what type of sequence it is.
    */
  var sequence_name: String = js.native
  /**
    * how much space the sequence has left.
    */
  var sequence_space: Double = js.native
  /**
    * the token the sequence is based off.
    */
  var token: String = js.native
  /**
    * uppercase variations of the token.
    */
  var uppercase_variations: Double = js.native
}

object ZXCVBNSequence {
  @scala.inline
  def apply(
    ascending: Boolean,
    base_guesses: Double,
    base_matches: String,
    base_token: String,
    dictionary_name: String,
    guesses: Double,
    guesses_log10: Double,
    i: Double,
    j: Double,
    l33t: Boolean,
    l33t_variations: Double,
    matched_word: String,
    pattern: String,
    rank: Double,
    repeat_count: Double,
    reversed: Boolean,
    sequence_name: String,
    sequence_space: Double,
    token: String,
    uppercase_variations: Double
  ): ZXCVBNSequence = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], base_guesses = base_guesses.asInstanceOf[js.Any], base_matches = base_matches.asInstanceOf[js.Any], base_token = base_token.asInstanceOf[js.Any], dictionary_name = dictionary_name.asInstanceOf[js.Any], guesses = guesses.asInstanceOf[js.Any], guesses_log10 = guesses_log10.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], j = j.asInstanceOf[js.Any], l33t = l33t.asInstanceOf[js.Any], l33t_variations = l33t_variations.asInstanceOf[js.Any], matched_word = matched_word.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], repeat_count = repeat_count.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any], sequence_name = sequence_name.asInstanceOf[js.Any], sequence_space = sequence_space.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], uppercase_variations = uppercase_variations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZXCVBNSequence]
  }
  @scala.inline
  implicit class ZXCVBNSequenceOps[Self <: ZXCVBNSequence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase_guesses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_guesses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase_matches(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDictionary_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuesses(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guesses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGuesses_log10(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guesses_log10")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withI(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("j")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL33t(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l33t")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL33t_variations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l33t_variations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatched_word(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matched_word")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeat_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeat_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReversed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reversed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequence_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequence_space(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence_space")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUppercase_variations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uppercase_variations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

