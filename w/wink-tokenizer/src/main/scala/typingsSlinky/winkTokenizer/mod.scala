package typingsSlinky.winkTokenizer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wink-tokenizer", JSImport.Namespace)
  @js.native
  /**
    * create a tokenizer instance
    */
  class ^ () extends Tokenizer
  
  /**
    * It defines 0 or more properties from the list of 14 properties.
    * A true value for a property ensures tokenization for that type of text;
    * whereas false value will mean that the tokenization of that type of text will not be attempted.
    *
    * An empty config object is equivalent to splitting on spaces.
    * Whatever tokens are created like this are tagged as alien
    * and z is the finger print code of this token type.
    */
  @js.native
  trait Config extends StObject {
    
    /**
      * such as $ or £ symbols
      * @default true
      */
    var currency: js.UndefOr[Boolean] = js.native
    
    /**
      * @default true
      */
    var email: js.UndefOr[Boolean] = js.native
    
    /**
      * @default true
      */
    var emoji: js.UndefOr[Boolean] = js.native
    
    /**
      * @default true
      */
    var emoticon: js.UndefOr[Boolean] = js.native
    
    /**
      * @default true
      */
    var hashtag: js.UndefOr[Boolean] = js.native
    
    /**
      * @default true
      */
    var mention: js.UndefOr[Boolean] = js.native
    
    /**
      * @default true
      */
    var number: js.UndefOr[Boolean] = js.native
    
    /**
      * ordinals like 1st , 2nd , 3rd , 4th or 12th or 91st
      * @default true
      */
    var ordinal: js.UndefOr[Boolean] = js.native
    
    /**
      * @default true
      */
    var punctuation: js.UndefOr[Boolean] = js.native
    
    /**
      * @default true
      */
    var quoted_phrase: js.UndefOr[Boolean] = js.native
    
    /**
      * @default true
      */
    var symbol: js.UndefOr[Boolean] = js.native
    
    /**
      * @default true
      */
    var time: js.UndefOr[Boolean] = js.native
    
    /**
      * @default true
      */
    var url: js.UndefOr[Boolean] = js.native
    
    /**
      * @default true
      */
    var word: js.UndefOr[Boolean] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: Boolean): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setEmail(value: Boolean): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setEmoji(value: Boolean): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
      
      @scala.inline
      def setEmoticon(value: Boolean): Self = StObject.set(x, "emoticon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmoticonUndefined: Self = StObject.set(x, "emoticon", js.undefined)
      
      @scala.inline
      def setHashtag(value: Boolean): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
      
      @scala.inline
      def setMention(value: Boolean): Self = StObject.set(x, "mention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMentionUndefined: Self = StObject.set(x, "mention", js.undefined)
      
      @scala.inline
      def setNumber(value: Boolean): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setOrdinal(value: Boolean): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
      
      @scala.inline
      def setPunctuation(value: Boolean): Self = StObject.set(x, "punctuation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPunctuationUndefined: Self = StObject.set(x, "punctuation", js.undefined)
      
      @scala.inline
      def setQuoted_phrase(value: Boolean): Self = StObject.set(x, "quoted_phrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoted_phraseUndefined: Self = StObject.set(x, "quoted_phrase", js.undefined)
      
      @scala.inline
      def setSymbol(value: Boolean): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      @scala.inline
      def setTime(value: Boolean): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      @scala.inline
      def setUrl(value: Boolean): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWord(value: Boolean): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.winkTokenizer.winkTokenizerStrings.word
    - typingsSlinky.winkTokenizer.winkTokenizerStrings.email
    - typingsSlinky.winkTokenizer.winkTokenizerStrings.emoji
    - typingsSlinky.winkTokenizer.winkTokenizerStrings.punctuation
    - typingsSlinky.winkTokenizer.winkTokenizerStrings.number
    - typingsSlinky.winkTokenizer.winkTokenizerStrings.time
    - typingsSlinky.winkTokenizer.winkTokenizerStrings.hashtag
    - typingsSlinky.winkTokenizer.winkTokenizerStrings.mention
    - typingsSlinky.winkTokenizer.winkTokenizerStrings.emoticon
    - typingsSlinky.winkTokenizer.winkTokenizerStrings.ordinal
    - typingsSlinky.winkTokenizer.winkTokenizerStrings.quoted_phrase
    - typingsSlinky.winkTokenizer.winkTokenizerStrings.url
    - typingsSlinky.winkTokenizer.winkTokenizerStrings.symbol
    - typingsSlinky.winkTokenizer.winkTokenizerStrings.currency
    - typingsSlinky.winkTokenizer.winkTokenizerStrings.alien
  */
  trait Tag extends StObject
  object Tag {
    
    @scala.inline
    def alien: typingsSlinky.winkTokenizer.winkTokenizerStrings.alien = "alien".asInstanceOf[typingsSlinky.winkTokenizer.winkTokenizerStrings.alien]
    
    @scala.inline
    def currency: typingsSlinky.winkTokenizer.winkTokenizerStrings.currency = "currency".asInstanceOf[typingsSlinky.winkTokenizer.winkTokenizerStrings.currency]
    
    @scala.inline
    def email: typingsSlinky.winkTokenizer.winkTokenizerStrings.email = "email".asInstanceOf[typingsSlinky.winkTokenizer.winkTokenizerStrings.email]
    
    @scala.inline
    def emoji: typingsSlinky.winkTokenizer.winkTokenizerStrings.emoji = "emoji".asInstanceOf[typingsSlinky.winkTokenizer.winkTokenizerStrings.emoji]
    
    @scala.inline
    def emoticon: typingsSlinky.winkTokenizer.winkTokenizerStrings.emoticon = "emoticon".asInstanceOf[typingsSlinky.winkTokenizer.winkTokenizerStrings.emoticon]
    
    @scala.inline
    def hashtag: typingsSlinky.winkTokenizer.winkTokenizerStrings.hashtag = "hashtag".asInstanceOf[typingsSlinky.winkTokenizer.winkTokenizerStrings.hashtag]
    
    @scala.inline
    def mention: typingsSlinky.winkTokenizer.winkTokenizerStrings.mention = "mention".asInstanceOf[typingsSlinky.winkTokenizer.winkTokenizerStrings.mention]
    
    @scala.inline
    def number: typingsSlinky.winkTokenizer.winkTokenizerStrings.number = "number".asInstanceOf[typingsSlinky.winkTokenizer.winkTokenizerStrings.number]
    
    @scala.inline
    def ordinal: typingsSlinky.winkTokenizer.winkTokenizerStrings.ordinal = "ordinal".asInstanceOf[typingsSlinky.winkTokenizer.winkTokenizerStrings.ordinal]
    
    @scala.inline
    def punctuation: typingsSlinky.winkTokenizer.winkTokenizerStrings.punctuation = "punctuation".asInstanceOf[typingsSlinky.winkTokenizer.winkTokenizerStrings.punctuation]
    
    @scala.inline
    def quoted_phrase: typingsSlinky.winkTokenizer.winkTokenizerStrings.quoted_phrase = "quoted_phrase".asInstanceOf[typingsSlinky.winkTokenizer.winkTokenizerStrings.quoted_phrase]
    
    @scala.inline
    def symbol: typingsSlinky.winkTokenizer.winkTokenizerStrings.symbol = "symbol".asInstanceOf[typingsSlinky.winkTokenizer.winkTokenizerStrings.symbol]
    
    @scala.inline
    def time: typingsSlinky.winkTokenizer.winkTokenizerStrings.time = "time".asInstanceOf[typingsSlinky.winkTokenizer.winkTokenizerStrings.time]
    
    @scala.inline
    def url: typingsSlinky.winkTokenizer.winkTokenizerStrings.url = "url".asInstanceOf[typingsSlinky.winkTokenizer.winkTokenizerStrings.url]
    
    @scala.inline
    def word: typingsSlinky.winkTokenizer.winkTokenizerStrings.word = "word".asInstanceOf[typingsSlinky.winkTokenizer.winkTokenizerStrings.word]
  }
  
  @js.native
  trait Token extends StObject {
    
    var tag: Tag = js.native
    
    var value: String = js.native
  }
  object Token {
    
    @scala.inline
    def apply(tag: Tag, value: String): Token = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tokenizer extends StObject {
    
    /**
      * Adds a regex for parsing a new type of token.
      * This regex can either be mapped to an existing tag or it allows creation of a new tag along with its finger print.
      * The uniqueness of the finger prints have to ensured by the user.
      * @param regex the new regular expression
      * @param tag tokens matching the regex will be assigned this tag
      * @param fingerprintCode
      */
    def addRegex(regex: js.RegExp, tag: String): Unit = js.native
    def addRegex(regex: js.RegExp, tag: String, fingerprintCode: String): Unit = js.native
    
    /**
      * Defines the configuration in terms of the types of token that will be extracted by tokenize() method.
      * Note by default, all types of tokens will be detected and tagged automatically.
      * @param config configuration object
      * @returns number of true parameters
      */
    def defineConfig(config: Config): Double = js.native
    
    /**
      * Returns the finger print of the tokens generated by the last call to tokenize().
      * A finger print is a string created by sequentially joining the unique code of each token's type.
      *
      * currency: 'r', email: 'e', emoji: 'j', emoticon: 'c',
      * hashtag: 'h', number: 'n', ordinal: 'o',
      * punctuation: token becomes fingerprint,
      * quoted_phrase: 'q', symbol: token becomes fingerprint,
      * time: 't', mention: 'm', url: 'u', word: 'w',
      * @return string of token types
      */
    def getTokensFP(): String = js.native
    
    /**
      * Tokenize a string
      * @param sentence to be tokenized
      * @returns tokens
      */
    def tokenize(sentence: String): js.Array[Token] = js.native
  }
}
