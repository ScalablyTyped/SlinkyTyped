package typingsSlinky.wordpressBlockEditor.components

import org.scalablytyped.runtime.StringDictionary
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.wordpressBlockEditor.anon.PartialEditorSettingsEdit
import typingsSlinky.wordpressBlocks.mod.BlockInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_Props1890041786[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def onChange(value: /* blocks */ js.Array[BlockInstance[StringDictionary[_]]] => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  @scala.inline
  def onInput(value: /* blocks */ js.Array[BlockInstance[StringDictionary[_]]] => Unit): this.type = set("onInput", js.Any.fromFunction1(value))
  @scala.inline
  def settings(value: PartialEditorSettingsEdit): this.type = set("settings", value.asInstanceOf[js.Any])
  @scala.inline
  def useSubRegistry(value: Boolean): this.type = set("useSubRegistry", value.asInstanceOf[js.Any])
  @scala.inline
  def value(value: js.Array[BlockInstance[StringDictionary[_]]]): this.type = set("value", value.asInstanceOf[js.Any])
}

