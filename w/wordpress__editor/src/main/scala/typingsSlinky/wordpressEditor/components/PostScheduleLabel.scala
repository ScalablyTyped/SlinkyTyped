package typingsSlinky.wordpressEditor.components

import typingsSlinky.wordpressEditor.mod.PostScheduleLabel.^
import typingsSlinky.wordpressEditor.postScheduleLabelMod.PostScheduleLabel.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PostScheduleLabel {
  @JSImport("@wordpress/editor", "PostScheduleLabel")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): SharedBuilder_Props607079379[^] = new SharedBuilder_Props607079379[^](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PostScheduleLabel.type): SharedBuilder_Props607079379[^] = new SharedBuilder_Props607079379[^](js.Array(this.component, js.Dictionary.empty))()
}

