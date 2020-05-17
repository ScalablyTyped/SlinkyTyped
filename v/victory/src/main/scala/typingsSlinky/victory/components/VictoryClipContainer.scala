package typingsSlinky.victory.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.victory.anon.Y
import typingsSlinky.victory.mod.BlockProps
import typingsSlinky.victory.mod.VictoryClipContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object VictoryClipContainer {
  @JSImport("victory", "VictoryClipContainer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.victory.mod.VictoryClipContainer] {
    @scala.inline
    def circleComponent(value: ReactElement): this.type = set("circleComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def clipHeight(value: Double): this.type = set("clipHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def clipId(value: Double | String): this.type = set("clipId", value.asInstanceOf[js.Any])
    @scala.inline
    def clipPadding(value: BlockProps): this.type = set("clipPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def clipPathComponent(value: ReactElement): this.type = set("clipPathComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def clipWidth(value: Double): this.type = set("clipWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def events(value: DOMAttributes[_]): this.type = set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def groupComponent(value: ReactElement): this.type = set("groupComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def origin(value: Y): this.type = set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def polar(value: Boolean): this.type = set("polar", value.asInstanceOf[js.Any])
    @scala.inline
    def radius(value: Double): this.type = set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def rectComponent(value: ReactElement): this.type = set("rectComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def translateX(value: Double): this.type = set("translateX", value.asInstanceOf[js.Any])
    @scala.inline
    def translateY(value: Double): this.type = set("translateY", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VictoryClipContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: VictoryClipContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

