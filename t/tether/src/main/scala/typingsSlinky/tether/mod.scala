package typingsSlinky.tether

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // global Tether constructor
  @JSImport("tether", JSImport.Namespace)
  @js.native
  class ^ protected () extends Tether {
    def this(options: ITetherOptions) = this()
  }
  
  /* static member */
  @JSImport("tether", "position")
  @js.native
  def position(): Unit = js.native
  
  @js.native
  trait ITetherConstraint extends StObject {
    
    var attachment: js.UndefOr[String] = js.native
    
    var outOfBoundsClass: js.UndefOr[String] = js.native
    
    var pin: js.UndefOr[Boolean | js.Array[String]] = js.native
    
    var pinnedClass: js.UndefOr[String] = js.native
    
    var to: js.UndefOr[String | HTMLElement | js.Array[Double]] = js.native
  }
  object ITetherConstraint {
    
    @scala.inline
    def apply(): ITetherConstraint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITetherConstraint]
    }
    
    @scala.inline
    implicit class ITetherConstraintMutableBuilder[Self <: ITetherConstraint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachment(value: String): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
      
      @scala.inline
      def setOutOfBoundsClass(value: String): Self = StObject.set(x, "outOfBoundsClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutOfBoundsClassUndefined: Self = StObject.set(x, "outOfBoundsClass", js.undefined)
      
      @scala.inline
      def setPin(value: Boolean | js.Array[String]): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
      
      @scala.inline
      def setPinVarargs(value: String*): Self = StObject.set(x, "pin", js.Array(value :_*))
      
      @scala.inline
      def setPinnedClass(value: String): Self = StObject.set(x, "pinnedClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinnedClassUndefined: Self = StObject.set(x, "pinnedClass", js.undefined)
      
      @scala.inline
      def setTo(value: String | HTMLElement | js.Array[Double]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToHTMLElement(value: HTMLElement): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setToVarargs(value: Double*): Self = StObject.set(x, "to", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ITetherOptions extends StObject {
    
    var attachment: String = js.native
    
    var bodyElement: js.UndefOr[HTMLElement] = js.native
    
    var classPrefix: js.UndefOr[String] = js.native
    
    var classes: js.UndefOr[StringDictionary[Boolean | String]] = js.native
    
    var constraints: js.UndefOr[js.Array[ITetherConstraint]] = js.native
    
    var element: js.UndefOr[HTMLElement | String | js.Any] = js.native
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var offset: js.UndefOr[String] = js.native
    
    var optimizations: js.UndefOr[js.Any] = js.native
    
    var target: js.UndefOr[HTMLElement | String | js.Any] = js.native
    
    var targetAttachment: js.UndefOr[String] = js.native
    
    var targetModifier: js.UndefOr[String] = js.native
    
    var targetOffset: js.UndefOr[String] = js.native
  }
  object ITetherOptions {
    
    @scala.inline
    def apply(attachment: String): ITetherOptions = {
      val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITetherOptions]
    }
    
    @scala.inline
    implicit class ITetherOptionsMutableBuilder[Self <: ITetherOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachment(value: String): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyElement(value: HTMLElement): Self = StObject.set(x, "bodyElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyElementUndefined: Self = StObject.set(x, "bodyElement", js.undefined)
      
      @scala.inline
      def setClassPrefix(value: String): Self = StObject.set(x, "classPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassPrefixUndefined: Self = StObject.set(x, "classPrefix", js.undefined)
      
      @scala.inline
      def setClasses(value: StringDictionary[Boolean | String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setConstraints(value: js.Array[ITetherConstraint]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      @scala.inline
      def setConstraintsVarargs(value: ITetherConstraint*): Self = StObject.set(x, "constraints", js.Array(value :_*))
      
      @scala.inline
      def setElement(value: HTMLElement | String | js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementHTMLElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOptimizations(value: js.Any): Self = StObject.set(x, "optimizations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizationsUndefined: Self = StObject.set(x, "optimizations", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLElement | String | js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetAttachment(value: String): Self = StObject.set(x, "targetAttachment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetAttachmentUndefined: Self = StObject.set(x, "targetAttachment", js.undefined)
      
      @scala.inline
      def setTargetHTMLElement(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetModifier(value: String): Self = StObject.set(x, "targetModifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetModifierUndefined: Self = StObject.set(x, "targetModifier", js.undefined)
      
      @scala.inline
      def setTargetOffset(value: String): Self = StObject.set(x, "targetOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetOffsetUndefined: Self = StObject.set(x, "targetOffset", js.undefined)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  // global Tether constructor
  @js.native
  trait Tether extends StObject {
    
    def destroy(): Unit = js.native
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    def position(): Unit = js.native
    
    def setOptions(options: ITetherOptions): Unit = js.native
  }
  object Tether {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      disable: () => Unit,
      enable: () => Unit,
      position: () => Unit,
      setOptions: ITetherOptions => Unit
    ): Tether = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), position = js.Any.fromFunction0(position), setOptions = js.Any.fromFunction1(setOptions))
      __obj.asInstanceOf[Tether]
    }
    
    @scala.inline
    implicit class TetherMutableBuilder[Self <: Tether] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPosition(value: () => Unit): Self = StObject.set(x, "position", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetOptions(value: ITetherOptions => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
    }
  }
}
