package typingsSlinky.storybookUi

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.emotionStyledBase.mod.StyledComponent
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactDraggable.anon.PartialDraggableProps
import typingsSlinky.reactDraggable.mod.DraggableProps
import typingsSlinky.reactDraggable.mod.default
import typingsSlinky.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draggersMod {
  
  @JSImport("@storybook/ui/dist/components/layout/draggers", "Draggable")
  @js.native
  class Draggable protected () extends default {
    def this(props: PartialDraggableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PartialDraggableProps, context: js.Any) = this()
  }
  /* static members */
  object Draggable {
    
    @JSImport("@storybook/ui/dist/components/layout/draggers", "Draggable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/draggers", "Draggable.defaultProps")
    @js.native
    def defaultProps: DraggableProps = js.native
    @scala.inline
    def defaultProps_=(x: DraggableProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/ui/dist/components/layout/draggers", "Handle")
  @js.native
  val Handle: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    typingsSlinky.storybookUi.anon.Axis, 
    Theme
  ] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.storybookUi.storybookUiStrings.x
    - typingsSlinky.storybookUi.storybookUiStrings.y
  */
  trait Axis extends StObject
  object Axis {
    
    @scala.inline
    def x: typingsSlinky.storybookUi.storybookUiStrings.x = "x".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.x]
    
    @scala.inline
    def y: typingsSlinky.storybookUi.storybookUiStrings.y = "y".asInstanceOf[typingsSlinky.storybookUi.storybookUiStrings.y]
  }
}
