package typingsSlinky.styletronReact.anon

import slinky.core.TagMod
import typingsSlinky.styletronReact.mod.DebugEngine
import typingsSlinky.styletronStandard.mod.StandardEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  def children(styletronEngine: StandardEngine, debugEngine: DebugEngine, hydrating: Boolean): TagMod[Any]
}

object Children {
  @scala.inline
  def apply(children: (StandardEngine, DebugEngine, Boolean) => TagMod[Any]): Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children))
    __obj.asInstanceOf[Children]
  }
}

