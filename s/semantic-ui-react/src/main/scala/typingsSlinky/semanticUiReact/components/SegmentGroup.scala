package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticShorthandContent
import typingsSlinky.semanticUiReact.segmentGroupMod.SegmentGroupProps
import typingsSlinky.semanticUiReact.segmentSegmentMod.SegmentSizeProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SegmentGroup {
  @JSImport("semantic-ui-react/dist/commonjs/elements/Segment/SegmentGroup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def piled(value: Boolean): this.type = set("piled", value.asInstanceOf[js.Any])
    @scala.inline
    def raised(value: Boolean): this.type = set("raised", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: SegmentSizeProp): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def stacked(value: Boolean): this.type = set("stacked", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SegmentGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SegmentGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

