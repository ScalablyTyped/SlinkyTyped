package typingsSlinky.wordpressEditor.components

import typingsSlinky.wordpressEditor.postScheduleLabelMod.PostScheduleLabel.Props
import typingsSlinky.wordpressEditor.postScheduleLabelMod.default.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Label {
  @JSImport("@wordpress/editor/components/post-schedule/label", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props607079379[^] = new SharedBuilder_Props607079379[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Label.type): SharedBuilder_Props607079379[^] = new SharedBuilder_Props607079379[^](js.Array(this.component, js.Dictionary.empty))()
}

