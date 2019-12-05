package typingsSlinky.twoDotJs.twoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Types extends js.Object

@JSImport("two.js", "Types")
@js.native
object Types extends js.Object {
  @js.native
  sealed trait canvas extends Types
  
  @js.native
  sealed trait svg extends Types
  
  @js.native
  sealed trait webgl extends Types
  
  /* 2 */ val canvas: typingsSlinky.twoDotJs.twoDotJsMod.Types.canvas with Double = js.native
  /* 0 */ val svg: typingsSlinky.twoDotJs.twoDotJsMod.Types.svg with Double = js.native
  /* 1 */ val webgl: typingsSlinky.twoDotJs.twoDotJsMod.Types.webgl with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Types with Double] = js.native
}

