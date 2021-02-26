package typingsSlinky.zxcvbn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zxcvbn", JSImport.Namespace)
  @js.native
  def apply(password: String): ZXCVBNResult = js.native
  @JSImport("zxcvbn", JSImport.Namespace)
  @js.native
  def apply(password: String, userInputs: js.Array[String]): ZXCVBNResult = js.native
  
  @js.native
  trait ZXCVBNAttackTime extends StObject {
    
    /**
      * offline attack with user-unique salting but a fast hash
      * function like SHA-1, SHA-256 or MD5. A wide range of
      * reasonable numbers anywhere from one billion - one trillion
      * guesses per second, depending on number of cores and machines.
      * ballparking at 10B/sec.
      */
    var offline_fast_hashing_1e10_per_second: String | Double = js.native
    
    /**
      * offline attack. assumes multiple attackers,
      * proper user-unique salting, and a slow hash function
      * w/ moderate work factor, such as bcrypt, scrypt, PBKDF2.
      */
    var offline_slow_hashing_1e4_per_second: String | Double = js.native
    
    /**
      * online attack on a service that doesn't ratelimit,
      * or where an attacker has outsmarted ratelimiting.
      */
    var online_no_throttling_10_per_second: String | Double = js.native
    
    /**
      * online attack on a service that ratelimits password auth attempts.
      */
    var online_throttling_100_per_hour: String | Double = js.native
  }
  object ZXCVBNAttackTime {
    
    @scala.inline
    def apply(
      offline_fast_hashing_1e10_per_second: String | Double,
      offline_slow_hashing_1e4_per_second: String | Double,
      online_no_throttling_10_per_second: String | Double,
      online_throttling_100_per_hour: String | Double
    ): ZXCVBNAttackTime = {
      val __obj = js.Dynamic.literal(offline_fast_hashing_1e10_per_second = offline_fast_hashing_1e10_per_second.asInstanceOf[js.Any], offline_slow_hashing_1e4_per_second = offline_slow_hashing_1e4_per_second.asInstanceOf[js.Any], online_no_throttling_10_per_second = online_no_throttling_10_per_second.asInstanceOf[js.Any], online_throttling_100_per_hour = online_throttling_100_per_hour.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZXCVBNAttackTime]
    }
    
    @scala.inline
    implicit class ZXCVBNAttackTimeMutableBuilder[Self <: ZXCVBNAttackTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffline_fast_hashing_1e10_per_second(value: String | Double): Self = StObject.set(x, "offline_fast_hashing_1e10_per_second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffline_slow_hashing_1e4_per_second(value: String | Double): Self = StObject.set(x, "offline_slow_hashing_1e4_per_second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnline_no_throttling_10_per_second(value: String | Double): Self = StObject.set(x, "online_no_throttling_10_per_second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnline_throttling_100_per_hour(value: String | Double): Self = StObject.set(x, "online_throttling_100_per_hour", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ZXCVBNFeedback extends StObject {
    
    /**
      * a possibly-empty list of suggestions to help choose a less
      * guessable password. eg. 'Add another word or two'
      */
    var suggestions: js.Array[String] = js.native
    
    /**
      * explains what's wrong, eg. 'this is a top-10 common password'.
      * not always set -- sometimes an empty string
      */
    var warning: String = js.native
  }
  object ZXCVBNFeedback {
    
    @scala.inline
    def apply(suggestions: js.Array[String], warning: String): ZXCVBNFeedback = {
      val __obj = js.Dynamic.literal(suggestions = suggestions.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZXCVBNFeedback]
    }
    
    @scala.inline
    implicit class ZXCVBNFeedbackMutableBuilder[Self <: ZXCVBNFeedback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSuggestions(value: js.Array[String]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsVarargs(value: String*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
      
      @scala.inline
      def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ZXCVBNResult extends StObject {
    
    /**
      * how long it took zxcvbn to calculate an answer,
      * in milliseconds.
      */
    var calc_time: Double = js.native
    
    /**
      * same keys as result.crack_times_seconds,
      * with friendlier display string values:
      * "less than a second", "3 hours", "centuries", etc.
      */
    var crack_times_display: ZXCVBNAttackTime = js.native
    
    /**
      * dictionary of back-of-the-envelope crack time
      * estimations, in seconds, based on a few scenarios.
      */
    var crack_times_seconds: ZXCVBNAttackTime = js.native
    
    /**
      * verbal feedback to help choose better passwords. set when score <= 2.
      */
    var feedback: ZXCVBNFeedback = js.native
    
    /**
      * estimated guesses needed to crack password
      */
    var guesses: Double = js.native
    
    /**
      * order of magnitude of result.guesses
      */
    var guesses_log10: Double = js.native
    
    /**
      * Integer from 0-4 (useful for implementing a strength bar):
      * 0 too guessable: risky password. (guesses < 10^3)
      * 1 very guessable: protection from throttled online attacks. (guesses < 10^6)
      * 2 somewhat guessable: protection from unthrottled online attacks. (guesses < 10^8)
      * 3 safely unguessable: moderate protection from offline slow-hash scenario. (guesses < 10^10)
      * 4 very unguessable: strong protection from offline slow-hash scenario. (guesses >= 10^10)
      */
    var score: ZXCVBNScore = js.native
    
    /**
      * the list of patterns that zxcvbn based the
      * guess calculation on.
      */
    var sequence: js.Array[ZXCVBNSequence] = js.native
  }
  object ZXCVBNResult {
    
    @scala.inline
    def apply(
      calc_time: Double,
      crack_times_display: ZXCVBNAttackTime,
      crack_times_seconds: ZXCVBNAttackTime,
      feedback: ZXCVBNFeedback,
      guesses: Double,
      guesses_log10: Double,
      score: ZXCVBNScore,
      sequence: js.Array[ZXCVBNSequence]
    ): ZXCVBNResult = {
      val __obj = js.Dynamic.literal(calc_time = calc_time.asInstanceOf[js.Any], crack_times_display = crack_times_display.asInstanceOf[js.Any], crack_times_seconds = crack_times_seconds.asInstanceOf[js.Any], feedback = feedback.asInstanceOf[js.Any], guesses = guesses.asInstanceOf[js.Any], guesses_log10 = guesses_log10.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZXCVBNResult]
    }
    
    @scala.inline
    implicit class ZXCVBNResultMutableBuilder[Self <: ZXCVBNResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalc_time(value: Double): Self = StObject.set(x, "calc_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrack_times_display(value: ZXCVBNAttackTime): Self = StObject.set(x, "crack_times_display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrack_times_seconds(value: ZXCVBNAttackTime): Self = StObject.set(x, "crack_times_seconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeedback(value: ZXCVBNFeedback): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuesses(value: Double): Self = StObject.set(x, "guesses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuesses_log10(value: Double): Self = StObject.set(x, "guesses_log10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScore(value: ZXCVBNScore): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequence(value: js.Array[ZXCVBNSequence]): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceVarargs(value: ZXCVBNSequence*): Self = StObject.set(x, "sequence", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.zxcvbn.zxcvbnNumbers.`0`
    - typingsSlinky.zxcvbn.zxcvbnNumbers.`1`
    - typingsSlinky.zxcvbn.zxcvbnNumbers.`2`
    - typingsSlinky.zxcvbn.zxcvbnNumbers.`3`
    - typingsSlinky.zxcvbn.zxcvbnNumbers.`4`
  */
  trait ZXCVBNScore extends StObject
  object ZXCVBNScore {
    
    @scala.inline
    def `0`: typingsSlinky.zxcvbn.zxcvbnNumbers.`0` = 0.asInstanceOf[typingsSlinky.zxcvbn.zxcvbnNumbers.`0`]
    
    @scala.inline
    def `1`: typingsSlinky.zxcvbn.zxcvbnNumbers.`1` = 1.asInstanceOf[typingsSlinky.zxcvbn.zxcvbnNumbers.`1`]
    
    @scala.inline
    def `2`: typingsSlinky.zxcvbn.zxcvbnNumbers.`2` = 2.asInstanceOf[typingsSlinky.zxcvbn.zxcvbnNumbers.`2`]
    
    @scala.inline
    def `3`: typingsSlinky.zxcvbn.zxcvbnNumbers.`3` = 3.asInstanceOf[typingsSlinky.zxcvbn.zxcvbnNumbers.`3`]
    
    @scala.inline
    def `4`: typingsSlinky.zxcvbn.zxcvbnNumbers.`4` = 4.asInstanceOf[typingsSlinky.zxcvbn.zxcvbnNumbers.`4`]
  }
  
  @js.native
  trait ZXCVBNSequence extends StObject {
    
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
    implicit class ZXCVBNSequenceMutableBuilder[Self <: ZXCVBNSequence] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase_guesses(value: Double): Self = StObject.set(x, "base_guesses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase_matches(value: String): Self = StObject.set(x, "base_matches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase_token(value: String): Self = StObject.set(x, "base_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictionary_name(value: String): Self = StObject.set(x, "dictionary_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuesses(value: Double): Self = StObject.set(x, "guesses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuesses_log10(value: Double): Self = StObject.set(x, "guesses_log10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJ(value: Double): Self = StObject.set(x, "j", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL33t(value: Boolean): Self = StObject.set(x, "l33t", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL33t_variations(value: Double): Self = StObject.set(x, "l33t_variations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatched_word(value: String): Self = StObject.set(x, "matched_word", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeat_count(value: Double): Self = StObject.set(x, "repeat_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequence_name(value: String): Self = StObject.set(x, "sequence_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequence_space(value: Double): Self = StObject.set(x, "sequence_space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUppercase_variations(value: Double): Self = StObject.set(x, "uppercase_variations", value.asInstanceOf[js.Any])
    }
  }
}
