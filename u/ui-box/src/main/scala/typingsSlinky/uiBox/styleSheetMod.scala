package typingsSlinky.uiBox

import org.scalajs.dom.raw.CSSRule
import org.scalajs.dom.raw.CSSStyleSheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleSheetMod {
  
  @JSImport("ui-box/dist/src/utils/style-sheet", JSImport.Default)
  @js.native
  class default () extends CustomStyleSheet {
    def this(options: Options) = this()
  }
  
  @js.native
  trait CustomStyleSheet extends StObject {
    
    def _insert(sheet: CSSStyleSheet, rule: String): Unit = js.native
    
    var ctr: js.Any = js.native
    
    def flush(): Unit = js.native
    
    def getSheet(): js.UndefOr[CSSStyleSheet] = js.native
    
    def inject(): Unit = js.native
    
    var injected: js.Any = js.native
    
    def insert(rule: String): Double = js.native
    
    var isSpeedy: js.Any = js.native
    
    var maxLength: js.Any = js.native
    
    def rules(): js.Array[CSSRule] = js.native
    
    var sheet: js.Any = js.native
    
    def speedy(bool: Boolean): Unit = js.native
    
    var tags: js.Any = js.native
  }
  object CustomStyleSheet {
    
    @scala.inline
    def apply(
      _insert: (CSSStyleSheet, String) => Unit,
      ctr: js.Any,
      flush: () => Unit,
      getSheet: () => js.UndefOr[CSSStyleSheet],
      inject: () => Unit,
      injected: js.Any,
      insert: String => Double,
      isSpeedy: js.Any,
      maxLength: js.Any,
      rules: () => js.Array[CSSRule],
      sheet: js.Any,
      speedy: Boolean => Unit,
      tags: js.Any
    ): CustomStyleSheet = {
      val __obj = js.Dynamic.literal(_insert = js.Any.fromFunction2(_insert), ctr = ctr.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), getSheet = js.Any.fromFunction0(getSheet), inject = js.Any.fromFunction0(inject), injected = injected.asInstanceOf[js.Any], insert = js.Any.fromFunction1(insert), isSpeedy = isSpeedy.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], rules = js.Any.fromFunction0(rules), sheet = sheet.asInstanceOf[js.Any], speedy = js.Any.fromFunction1(speedy), tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomStyleSheet]
    }
    
    @scala.inline
    implicit class CustomStyleSheetMutableBuilder[Self <: CustomStyleSheet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCtr(value: js.Any): Self = StObject.set(x, "ctr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSheet(value: () => js.UndefOr[CSSStyleSheet]): Self = StObject.set(x, "getSheet", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInject(value: () => Unit): Self = StObject.set(x, "inject", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInjected(value: js.Any): Self = StObject.set(x, "injected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsert(value: String => Double): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsSpeedy(value: js.Any): Self = StObject.set(x, "isSpeedy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: js.Any): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRules(value: () => js.Array[CSSRule]): Self = StObject.set(x, "rules", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSheet(value: js.Any): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedy(value: Boolean => Unit): Self = StObject.set(x, "speedy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTags(value: js.Any): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_insert(value: (CSSStyleSheet, String) => Unit): Self = StObject.set(x, "_insert", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var speedy: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setSpeedy(value: Boolean): Self = StObject.set(x, "speedy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedyUndefined: Self = StObject.set(x, "speedy", js.undefined)
    }
  }
}
