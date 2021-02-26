package typingsSlinky.wonka

import typingsSlinky.wonka.wonkaTypesMod.Operator
import typingsSlinky.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaOperatorBufferMod {
  
  @JSImport("wonka/src/operators/wonka_operator_buffer", "buffer")
  @js.native
  def buffer[A](signal: Source[_]): Operator[A, js.Array[A]] = js.native
}
