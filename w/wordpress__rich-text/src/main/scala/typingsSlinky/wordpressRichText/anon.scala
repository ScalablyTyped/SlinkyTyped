package typingsSlinky.wordpressRichText

import org.scalajs.dom.raw.Range
import typingsSlinky.wordpressRichText.mod.NamedFormatConfiguration
import typingsSlinky.wordpressRichText.mod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Element extends StObject {
    
    var element: org.scalajs.dom.raw.Element = js.native
    
    var multilineTag: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any
      ] = js.native
    
    var multilineWrapperTags: js.UndefOr[
        js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
        ]
      ] = js.native
    
    var range: js.UndefOr[Range] = js.native
  }
  object Element {
    
    @scala.inline
    def apply(element: org.scalajs.dom.raw.Element): Element = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineTag(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any): Self = StObject.set(x, "multilineTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineTagUndefined: Self = StObject.set(x, "multilineTag", js.undefined)
      
      @scala.inline
      def setMultilineWrapperTags(
        value: js.Array[
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
            ]
      ): Self = StObject.set(x, "multilineWrapperTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineWrapperTagsUndefined: Self = StObject.set(x, "multilineWrapperTags", js.undefined)
      
      @scala.inline
      def setMultilineWrapperTagsVarargs(
        value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any)*
      ): Self = StObject.set(x, "multilineWrapperTags", js.Array(value :_*))
      
      @scala.inline
      def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    }
  }
  
  @js.native
  trait Html extends StObject {
    
    var html: String = js.native
  }
  object Html {
    
    @scala.inline
    def apply(html: String): Html = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
      __obj.asInstanceOf[Html]
    }
    
    @scala.inline
    implicit class HtmlMutableBuilder[Self <: Html] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MultilineTag extends StObject {
    
    var multilineTag: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any
      ] = js.native
    
    var value: Value = js.native
  }
  object MultilineTag {
    
    @scala.inline
    def apply(value: Value): MultilineTag = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultilineTag]
    }
    
    @scala.inline
    implicit class MultilineTagMutableBuilder[Self <: MultilineTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMultilineTag(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any): Self = StObject.set(x, "multilineTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineTagUndefined: Self = StObject.set(x, "multilineTag", js.undefined)
      
      @scala.inline
      def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Text extends StObject {
    
    var text: String = js.native
  }
  object Text {
    
    @scala.inline
    def apply(text: String): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofimportedActions extends StObject {
    
    def addFormatTypes(configs: js.Array[NamedFormatConfiguration]): Unit = js.native
    def addFormatTypes(configs: NamedFormatConfiguration): Unit = js.native
    
    def removeFormatTypes(names: String): Unit = js.native
    def removeFormatTypes(names: js.Array[String]): Unit = js.native
  }
  
  @js.native
  trait TypeofimportedSelectors extends StObject {
    
    def getFormatType(name: String): js.UndefOr[NamedFormatConfiguration] = js.native
    
    def getFormatTypeForBareElement(
      bareElementTagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
    ): js.UndefOr[NamedFormatConfiguration] = js.native
    
    def getFormatTypeForClassName(elementClassName: String): js.UndefOr[NamedFormatConfiguration] = js.native
    
    def getFormatTypes(): js.Array[NamedFormatConfiguration] = js.native
  }
  object TypeofimportedSelectors {
    
    @scala.inline
    def apply(
      getFormatType: String => js.UndefOr[NamedFormatConfiguration],
      getFormatTypeForBareElement: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any => js.UndefOr[NamedFormatConfiguration],
      getFormatTypeForClassName: String => js.UndefOr[NamedFormatConfiguration],
      getFormatTypes: () => js.Array[NamedFormatConfiguration]
    ): TypeofimportedSelectors = {
      val __obj = js.Dynamic.literal(getFormatType = js.Any.fromFunction1(getFormatType), getFormatTypeForBareElement = js.Any.fromFunction1(getFormatTypeForBareElement), getFormatTypeForClassName = js.Any.fromFunction1(getFormatTypeForClassName), getFormatTypes = js.Any.fromFunction0(getFormatTypes))
      __obj.asInstanceOf[TypeofimportedSelectors]
    }
    
    @scala.inline
    implicit class TypeofimportedSelectorsMutableBuilder[Self <: TypeofimportedSelectors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetFormatType(value: String => js.UndefOr[NamedFormatConfiguration]): Self = StObject.set(x, "getFormatType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFormatTypeForBareElement(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any => js.UndefOr[NamedFormatConfiguration]
      ): Self = StObject.set(x, "getFormatTypeForBareElement", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFormatTypeForClassName(value: String => js.UndefOr[NamedFormatConfiguration]): Self = StObject.set(x, "getFormatTypeForClassName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFormatTypes(value: () => js.Array[NamedFormatConfiguration]): Self = StObject.set(x, "getFormatTypes", js.Any.fromFunction0(value))
    }
  }
}
