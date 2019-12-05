package typingsSlinky.styletronDashReact

import slinky.core.TagMod
import typingsSlinky.styletronDashReact.styletronDashReactMod.DebugEngine
import typingsSlinky.styletronDashStandard.styletronDashStandardMod.StandardEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  def children(styletronEngine: StandardEngine, debugEngine: DebugEngine, hydrating: Boolean): TagMod[Any]
}

object Anon_Children {
  @scala.inline
  def apply(children: (StandardEngine, DebugEngine, Boolean) => TagMod[Any]): Anon_Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children))
  
    __obj.asInstanceOf[Anon_Children]
  }
}

