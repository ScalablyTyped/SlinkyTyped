package typingsSlinky.transliteration

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.transliteration.charmapMod.Charmap_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait BrowserGlobalObject extends StObject {
    
    def slugify(source: String): String = js.native
    def slugify(source: String, options: OptionsSlugify): String = js.native
    @JSName("slugify")
    var slugify_Original: SlugifyFunction = js.native
    
    def transl(source: String): String = js.native
    def transl(source: String, options: OptionsTransliterate): String = js.native
    @JSName("transl")
    var transl_Original: TransliterateFunction = js.native
    
    def transliterate(source: String): String = js.native
    def transliterate(source: String, options: OptionsTransliterate): String = js.native
    @JSName("transliterate")
    var transliterate_Original: TransliterateFunction = js.native
  }
  
  type IntervalArray = js.Array[js.Tuple2[Double, Double]]
  
  type OptionReplaceArray = js.Array[OptionReplaceArrayItem]
  
  type OptionReplaceArrayItem = js.Tuple2[String | js.RegExp, String]
  
  type OptionReplaceCombined = OptionReplaceArray | OptionReplaceObject
  
  type OptionReplaceObject = StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.transliteration.typesMod.OptionsTransliterate
    - typingsSlinky.transliteration.typesMod.OptionsSlugify
  */
  trait Options extends StObject
  object Options {
    
    @scala.inline
    def OptionsSlugify(): typingsSlinky.transliteration.typesMod.OptionsSlugify = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.transliteration.typesMod.OptionsSlugify]
    }
    
    @scala.inline
    def OptionsTransliterate(): typingsSlinky.transliteration.typesMod.OptionsTransliterate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.transliteration.typesMod.OptionsTransliterate]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.transliteration.typesMod.Options because Already inherited */ @js.native
  trait OptionsSlugify extends OptionsTransliterate {
    
    /**
      * Allowed characters.
      * When `allowedChars` is set to `'abc'`, then only characters match `/[abc]/g` will be preserved.
      * Other characters will all be converted to `separator`
      * @default 'a-zA-Z0-9-_.~''
      */
    var allowedChars: js.UndefOr[String] = js.native
    
    /**
      * Whether the result need to be converted into lowercase
      * @default true
      */
    var lowercase: js.UndefOr[Boolean] = js.native
    
    /**
      * Custom separator string
      * @default '-'
      */
    var separator: js.UndefOr[String] = js.native
    
    /**
      * Whether the result need to be converted into uppercase
      * @default false
      */
    var uppercase: js.UndefOr[Boolean] = js.native
  }
  object OptionsSlugify {
    
    @scala.inline
    def apply(): OptionsSlugify = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsSlugify]
    }
    
    @scala.inline
    implicit class OptionsSlugifyMutableBuilder[Self <: OptionsSlugify] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedChars(value: String): Self = StObject.set(x, "allowedChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedCharsUndefined: Self = StObject.set(x, "allowedChars", js.undefined)
      
      @scala.inline
      def setLowercase(value: Boolean): Self = StObject.set(x, "lowercase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowercaseUndefined: Self = StObject.set(x, "lowercase", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setUppercase(value: Boolean): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUppercaseUndefined: Self = StObject.set(x, "uppercase", js.undefined)
    }
  }
  
  @js.native
  trait OptionsTransliterate extends Options {
    
    /**
      * Fix Chinese spacing. For example, `你好` is transliterated to `Ni Hao` instead of `NiHao`. If you don't need to transliterate Chinese characters, set it to false to false to improve performance.
      * @default true
      */
    var fixChineseSpacing: js.UndefOr[Boolean] = js.native
    
    /**
      * Ignore a list of strings untouched
      * @example tr('你好，世界', { ignore: ['你'] }) // 你 Hao , Shi Jie
      */
    var ignore: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Replace a list of string / regex in the source string into the provided target string before transliteration
      * The option can either be an array or an object
      * @example tr('你好，世界', { replace: {你: 'You'} }) // You Hao , Shi Jie
      * @example tr('你好，世界', { replace: [['你', 'You']] }) // You Hao , Shi Jie
      * @example tr('你好，世界', { replace: [[/你/g, 'You']] }) // You Hao , Shi Jie
      */
    var replace: js.UndefOr[OptionReplaceCombined] = js.native
    
    /**
      * Same as `replace` but after transliteration
      */
    var replaceAfter: js.UndefOr[OptionReplaceCombined] = js.native
    
    /**
      * Decides whether or not to trim the result string after transliteration
      * @default false
      */
    var trim: js.UndefOr[Boolean] = js.native
    
    /**
      * Any characters not known by this library will be replaced by a specific string `unknown`
      * @default ''
      */
    var unknown: js.UndefOr[String] = js.native
  }
  object OptionsTransliterate {
    
    @scala.inline
    def apply(): OptionsTransliterate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsTransliterate]
    }
    
    @scala.inline
    implicit class OptionsTransliterateMutableBuilder[Self <: OptionsTransliterate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixChineseSpacing(value: Boolean): Self = StObject.set(x, "fixChineseSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixChineseSpacingUndefined: Self = StObject.set(x, "fixChineseSpacing", js.undefined)
      
      @scala.inline
      def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setReplace(value: OptionReplaceCombined): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceAfter(value: OptionReplaceCombined): Self = StObject.set(x, "replaceAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceAfterUndefined: Self = StObject.set(x, "replaceAfter", js.undefined)
      
      @scala.inline
      def setReplaceAfterVarargs(value: OptionReplaceArrayItem*): Self = StObject.set(x, "replaceAfter", js.Array(value :_*))
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      @scala.inline
      def setReplaceVarargs(value: OptionReplaceArrayItem*): Self = StObject.set(x, "replace", js.Array(value :_*))
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      @scala.inline
      def setUnknown(value: String): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
  
  type SlugifyFunction = TransliterationFunction[OptionsSlugify]
  
  type TransliterateFunction = TransliterationFunction[OptionsTransliterate]
  
  @js.native
  trait TransliterationFunction[T] extends StObject {
    
    def apply(source: String): String = js.native
    def apply(source: String, options: T): String = js.native
    
    /**
      * Set default config
      * @param options
      * @param reset
      */
    def config(): T = js.native
    def config(options: T): T = js.native
    def config(options: T, reset: Boolean): T = js.native
    def config(options: js.UndefOr[scala.Nothing], reset: Boolean): T = js.native
    
    /**
      * Used by browser
      */
    var noConflict: js.UndefOr[js.Function0[TransliterationFunction[T]]] = js.native
    
    /**
      * Set charmap data
      * @param data
      * @param reset
      * @memberof Transliterate
      */
    def setData(): Charmap_ = js.native
    def setData(data: js.UndefOr[scala.Nothing], reset: Boolean): Charmap_ = js.native
    def setData(data: Charmap_): Charmap_ = js.native
    def setData(data: Charmap_, reset: Boolean): Charmap_ = js.native
  }
}
