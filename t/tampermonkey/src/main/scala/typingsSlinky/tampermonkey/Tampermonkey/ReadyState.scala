package typingsSlinky.tampermonkey.Tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadyState extends js.Object

// Response
@JSGlobal("Tampermonkey.ReadyState")
@js.native
object ReadyState extends js.Object {
  @js.native
  sealed trait Done extends ReadyState
  
  @js.native
  sealed trait HeadersReceived extends ReadyState
  
  @js.native
  sealed trait Loading extends ReadyState
  
  @js.native
  sealed trait Opened extends ReadyState
  
  @js.native
  sealed trait Unsent extends ReadyState
  
  /* 4 */ val Done: typingsSlinky.tampermonkey.Tampermonkey.ReadyState.Done with Double = js.native
  /* 2 */ val HeadersReceived: typingsSlinky.tampermonkey.Tampermonkey.ReadyState.HeadersReceived with Double = js.native
  /* 3 */ val Loading: typingsSlinky.tampermonkey.Tampermonkey.ReadyState.Loading with Double = js.native
  /* 1 */ val Opened: typingsSlinky.tampermonkey.Tampermonkey.ReadyState.Opened with Double = js.native
  /* 0 */ val Unsent: typingsSlinky.tampermonkey.Tampermonkey.ReadyState.Unsent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReadyState with Double] = js.native
}

