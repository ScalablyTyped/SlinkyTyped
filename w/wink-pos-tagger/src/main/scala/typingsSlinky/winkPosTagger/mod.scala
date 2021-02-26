package typingsSlinky.winkPosTagger

import typingsSlinky.winkPosTagger.anon.Lemma
import typingsSlinky.winkTokenizer.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wink-pos-tagger", JSImport.Namespace)
  @js.native
  /**
    * create a tagger instance
    */
  class ^ () extends Tagger
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.PRP
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.VBD
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.DT
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.JJ
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.NN
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.IN
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.VBG
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.Dot
  */
  trait PosTag extends StObject
  object PosTag {
    
    @scala.inline
    def DT: typingsSlinky.winkPosTagger.winkPosTaggerStrings.DT = "DT".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.DT]
    
    @scala.inline
    def Dot: typingsSlinky.winkPosTagger.winkPosTaggerStrings.Dot = ".".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.Dot]
    
    @scala.inline
    def IN: typingsSlinky.winkPosTagger.winkPosTaggerStrings.IN = "IN".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.IN]
    
    @scala.inline
    def JJ: typingsSlinky.winkPosTagger.winkPosTaggerStrings.JJ = "JJ".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.JJ]
    
    @scala.inline
    def NN: typingsSlinky.winkPosTagger.winkPosTaggerStrings.NN = "NN".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.NN]
    
    @scala.inline
    def PRP: typingsSlinky.winkPosTagger.winkPosTaggerStrings.PRP = "PRP".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.PRP]
    
    @scala.inline
    def VBD: typingsSlinky.winkPosTagger.winkPosTaggerStrings.VBD = "VBD".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.VBD]
    
    @scala.inline
    def VBG: typingsSlinky.winkPosTagger.winkPosTaggerStrings.VBG = "VBG".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.VBG]
  }
  
  @js.native
  trait PosTaggedToken extends StObject {
    
    var lemma: js.UndefOr[String] = js.native
    
    var normal: String = js.native
    
    var pos: PosTag = js.native
    
    var tag: Tag = js.native
    
    var value: String = js.native
  }
  object PosTaggedToken {
    
    @scala.inline
    def apply(normal: String, pos: PosTag, tag: Tag, value: String): PosTaggedToken = {
      val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PosTaggedToken]
    }
    
    @scala.inline
    implicit class PosTaggedTokenMutableBuilder[Self <: PosTaggedToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLemma(value: String): Self = StObject.set(x, "lemma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLemmaUndefined: Self = StObject.set(x, "lemma", js.undefined)
      
      @scala.inline
      def setNormal(value: String): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: PosTag): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.word
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.email
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.emoji
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.punctuation
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.number
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.time
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.hashtag
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.mention
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.emoticon
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.ordinal
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.quoted_phrase
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.url
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.symbol
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.currency
    - typingsSlinky.winkPosTagger.winkPosTaggerStrings.alien
  */
  trait Tag extends StObject
  object Tag {
    
    @scala.inline
    def alien: typingsSlinky.winkPosTagger.winkPosTaggerStrings.alien = "alien".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.alien]
    
    @scala.inline
    def currency: typingsSlinky.winkPosTagger.winkPosTaggerStrings.currency = "currency".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.currency]
    
    @scala.inline
    def email: typingsSlinky.winkPosTagger.winkPosTaggerStrings.email = "email".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.email]
    
    @scala.inline
    def emoji: typingsSlinky.winkPosTagger.winkPosTaggerStrings.emoji = "emoji".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.emoji]
    
    @scala.inline
    def emoticon: typingsSlinky.winkPosTagger.winkPosTaggerStrings.emoticon = "emoticon".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.emoticon]
    
    @scala.inline
    def hashtag: typingsSlinky.winkPosTagger.winkPosTaggerStrings.hashtag = "hashtag".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.hashtag]
    
    @scala.inline
    def mention: typingsSlinky.winkPosTagger.winkPosTaggerStrings.mention = "mention".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.mention]
    
    @scala.inline
    def number: typingsSlinky.winkPosTagger.winkPosTaggerStrings.number = "number".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.number]
    
    @scala.inline
    def ordinal: typingsSlinky.winkPosTagger.winkPosTaggerStrings.ordinal = "ordinal".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.ordinal]
    
    @scala.inline
    def punctuation: typingsSlinky.winkPosTagger.winkPosTaggerStrings.punctuation = "punctuation".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.punctuation]
    
    @scala.inline
    def quoted_phrase: typingsSlinky.winkPosTagger.winkPosTaggerStrings.quoted_phrase = "quoted_phrase".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.quoted_phrase]
    
    @scala.inline
    def symbol: typingsSlinky.winkPosTagger.winkPosTaggerStrings.symbol = "symbol".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.symbol]
    
    @scala.inline
    def time: typingsSlinky.winkPosTagger.winkPosTaggerStrings.time = "time".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.time]
    
    @scala.inline
    def url: typingsSlinky.winkPosTagger.winkPosTaggerStrings.url = "url".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.url]
    
    @scala.inline
    def word: typingsSlinky.winkPosTagger.winkPosTaggerStrings.word = "word".asInstanceOf[typingsSlinky.winkPosTagger.winkPosTaggerStrings.word]
  }
  
  @js.native
  trait Tagger extends StObject {
    
    /**
      * This API has no effect. It has been maintained for compatibility purpose.
      * The wink-tokenizer will now always add lemma and normal forms.
      * Note, lemmas are added only for nouns (excluding proper noun), verbs and adjectives.
      * @param config configuration object
      * @returns object with active configuration
      */
    def defineConfig(config: js.Any): Lemma = js.native
    
    /**
      * Tags the input tokens with their pos.
      * In order to pos tag a sentence directly, use tagSentence API instead
      * @param tokens array of tokens, as produced by the wink tokenizer
      * @return pos tagged tokens
      */
    def tag(tokens: js.Array[Token]): js.Array[PosTaggedToken] = js.native
    
    /**
      * Tags the raw tokens with their pos.
      * Note, it only categorizes each token in to one of the following 3-categories (a) word, or (b) punctuation, or (c) number.
      * @param tokens to be pos tagged. They are simple array of string.
      * @return pos tagged tokens
      */
    def tagRawTokens(tokens: js.Array[String]): js.Array[PosTaggedToken] = js.native
    
    /**
      * Tokenizes the input sentence and tags the tokens.
      * @param sentence to be pos tagged
      * @return pos tagged tokens
      */
    def tagSentence(sentence: String): js.Array[PosTaggedToken] = js.native
    
    /**
      * Updates the internal lexicon using the input lexicon.
      * If a word/pos pair is found in the internal lexicon then it's value is updated with the new pos; otherwise it added.
      * @param lexicon object with word/pos pairs to be added or replaced in the existing lexicon.
      * @return pos tagged tokens
      */
    def updateLexicon(lexicon: js.Object): Unit = js.native
  }
  object Tagger {
    
    @scala.inline
    def apply(
      defineConfig: js.Any => Lemma,
      tag: js.Array[Token] => js.Array[PosTaggedToken],
      tagRawTokens: js.Array[String] => js.Array[PosTaggedToken],
      tagSentence: String => js.Array[PosTaggedToken],
      updateLexicon: js.Object => Unit
    ): Tagger = {
      val __obj = js.Dynamic.literal(defineConfig = js.Any.fromFunction1(defineConfig), tag = js.Any.fromFunction1(tag), tagRawTokens = js.Any.fromFunction1(tagRawTokens), tagSentence = js.Any.fromFunction1(tagSentence), updateLexicon = js.Any.fromFunction1(updateLexicon))
      __obj.asInstanceOf[Tagger]
    }
    
    @scala.inline
    implicit class TaggerMutableBuilder[Self <: Tagger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefineConfig(value: js.Any => Lemma): Self = StObject.set(x, "defineConfig", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTag(value: js.Array[Token] => js.Array[PosTaggedToken]): Self = StObject.set(x, "tag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTagRawTokens(value: js.Array[String] => js.Array[PosTaggedToken]): Self = StObject.set(x, "tagRawTokens", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTagSentence(value: String => js.Array[PosTaggedToken]): Self = StObject.set(x, "tagSentence", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateLexicon(value: js.Object => Unit): Self = StObject.set(x, "updateLexicon", js.Any.fromFunction1(value))
    }
  }
}
