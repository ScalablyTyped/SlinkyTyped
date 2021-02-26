package typingsSlinky.wonka

import typingsSlinky.wonka.anon.Tag
import typingsSlinky.wonka.wonkaNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaTypesMod {
  
  type List[T] = (js.Tuple2[T, js.Any]) | `0`
  
  type Observer[A] = js.Tuple2[js.Function1[/* value */ A, Unit], js.Function0[Unit]]
  
  type Operator[A, B] = js.Function1[/* source */ Source[A], Source[B]]
  
  type Signal[A] = (Tag with (js.Array[js.Function1[/* talkback */ Talkback, Unit]])) | (typingsSlinky.wonka.anon.`0` with js.Array[A]) | `0`
  
  type Sink[A] = js.Function1[/* signal */ Signal[A], Unit]
  
  type Source[A] = js.Function1[/* sink */ Sink[A], Unit]
  
  type Subject[A] = js.Tuple3[Source[A], js.Function1[/* value */ A, Unit], js.Function0[Unit]]
  
  type Subscription = js.Array[js.Function0[Unit]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.wonka.wonkaNumbers.`0`
    - typingsSlinky.wonka.wonkaNumbers.`1`
  */
  trait Talkback extends StObject
  object Talkback {
    
    @scala.inline
    def `0`: typingsSlinky.wonka.wonkaNumbers.`0` = 0.asInstanceOf[typingsSlinky.wonka.wonkaNumbers.`0`]
    
    @scala.inline
    def `1`: typingsSlinky.wonka.wonkaNumbers.`1` = 1.asInstanceOf[typingsSlinky.wonka.wonkaNumbers.`1`]
  }
}
