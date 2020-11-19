package typingsSlinky.semanticUiReact.stepGroupMod

import slinky.core.facade.ReactElement
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandItem
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`1`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`2`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`3`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`4`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`5`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`6`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`7`
import typingsSlinky.semanticUiReact.semanticUiReactNumbers.`8`
import typingsSlinky.semanticUiReact.semanticUiReactStrings.big
import typingsSlinky.semanticUiReact.semanticUiReactStrings.bottom
import typingsSlinky.semanticUiReact.semanticUiReactStrings.eight
import typingsSlinky.semanticUiReact.semanticUiReactStrings.five
import typingsSlinky.semanticUiReact.semanticUiReactStrings.four
import typingsSlinky.semanticUiReact.semanticUiReactStrings.huge
import typingsSlinky.semanticUiReact.semanticUiReactStrings.large
import typingsSlinky.semanticUiReact.semanticUiReactStrings.massive
import typingsSlinky.semanticUiReact.semanticUiReactStrings.mini
import typingsSlinky.semanticUiReact.semanticUiReactStrings.one
import typingsSlinky.semanticUiReact.semanticUiReactStrings.seven
import typingsSlinky.semanticUiReact.semanticUiReactStrings.six
import typingsSlinky.semanticUiReact.semanticUiReactStrings.small
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tablet
import typingsSlinky.semanticUiReact.semanticUiReactStrings.three
import typingsSlinky.semanticUiReact.semanticUiReactStrings.tiny
import typingsSlinky.semanticUiReact.semanticUiReactStrings.top
import typingsSlinky.semanticUiReact.semanticUiReactStrings.two
import typingsSlinky.semanticUiReact.stepStepMod.StepProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictStepGroupProps extends js.Object {
  
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  
  /** Steps can be attached to other elements. */
  var attached: js.UndefOr[Boolean | bottom | top] = js.native
  
  /** Primary content. */
  var children: js.UndefOr[ReactElement] = js.native
  
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  
  /** A fluid step takes up the width of its container. */
  var fluid: js.UndefOr[Boolean] = js.native
  
  /** Shorthand array of props for Step. */
  var items: js.UndefOr[SemanticShorthandCollection[StepProps]] = js.native
  
  /** A step can show a ordered sequence of steps. */
  var ordered: js.UndefOr[Boolean] = js.native
  
  /** Steps can have different sizes. */
  var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.native
  
  /** A step can stack vertically only on smaller screens. */
  var stackable: js.UndefOr[tablet] = js.native
  
  /** A step can prevent itself from stacking on mobile. */
  var unstackable: js.UndefOr[Boolean] = js.native
  
  /** A step can be displayed stacked vertically. */
  var vertical: js.UndefOr[Boolean] = js.native
  
  /** Steps can be divided evenly inside their parent. */
  var widths: js.UndefOr[
    `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`1` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`2` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`3` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`4` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`5` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`6` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`7` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`8` | one | two | three | four | five | six | seven | eight
  ] = js.native
}
object StrictStepGroupProps {
  
  @scala.inline
  def apply(): StrictStepGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictStepGroupProps]
  }
  
  @scala.inline
  implicit class StrictStepGroupPropsOps[Self <: StrictStepGroupProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setAttached(value: Boolean | bottom | top): Self = this.set("attached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttached: Self = this.set("attached", js.undefined)
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContentReactElement(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setFluid(value: Boolean): Self = this.set("fluid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFluid: Self = this.set("fluid", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SemanticShorthandItem[StepProps]*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: SemanticShorthandCollection[StepProps]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setOrdered(value: Boolean): Self = this.set("ordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrdered: Self = this.set("ordered", js.undefined)
    
    @scala.inline
    def setSize(value: mini | tiny | small | large | big | huge | massive): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStackable(value: tablet): Self = this.set("stackable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackable: Self = this.set("stackable", js.undefined)
    
    @scala.inline
    def setUnstackable(value: Boolean): Self = this.set("unstackable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnstackable: Self = this.set("unstackable", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    
    @scala.inline
    def setWidths(
      value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`1` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`2` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`3` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`4` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`5` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`6` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`7` | typingsSlinky.semanticUiReact.semanticUiReactStrings.`8` | one | two | three | four | five | six | seven | eight
    ): Self = this.set("widths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidths: Self = this.set("widths", js.undefined)
  }
}
