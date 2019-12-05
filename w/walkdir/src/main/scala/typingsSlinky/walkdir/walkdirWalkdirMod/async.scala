package typingsSlinky.walkdir.walkdirWalkdirMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.walkdir.Anon_FalseReturnobject
import typingsSlinky.walkdir.Anon_ReturnobjectBoolean
import typingsSlinky.walkdir.Anon_ReturnobjectTrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("walkdir/walkdir", "async")
@js.native
object async extends js.Object {
  def apply(path: String): js.Promise[js.Array[String]] = js.native
  def apply(
    path: String,
    options: WalkOptions with (Anon_FalseReturnobject | Anon_ReturnobjectBoolean | Anon_ReturnobjectTrue)
  ): js.Promise[StringDictionary[Stats]] = js.native
  def apply(
    path: String,
    options: WalkOptions with (Anon_FalseReturnobject | Anon_ReturnobjectBoolean | Anon_ReturnobjectTrue),
    eventListener: WalkEventListener
  ): js.Promise[StringDictionary[Stats]] = js.native
}

