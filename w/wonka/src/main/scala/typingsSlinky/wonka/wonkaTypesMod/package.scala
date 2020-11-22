package typingsSlinky.wonka

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object wonkaTypesMod {
  
  type List[T] = (js.Tuple2[T, js.Any]) | typingsSlinky.wonka.wonkaNumbers.`0`
  
  type Observer[A] = js.Tuple2[js.Function1[/* value */ A, scala.Unit], js.Function0[scala.Unit]]
  
  type Operator[A, B] = js.Function1[
    /* source */ typingsSlinky.wonka.wonkaTypesMod.Source[A], 
    typingsSlinky.wonka.wonkaTypesMod.Source[B]
  ]
  
  type Signal[A] = (typingsSlinky.wonka.anon.Tag with (js.Array[
    js.Function1[/* talkback */ typingsSlinky.wonka.wonkaTypesMod.Talkback, scala.Unit]
  ])) | (typingsSlinky.wonka.anon.`0` with js.Array[A]) | typingsSlinky.wonka.wonkaNumbers.`0`
  
  type Sink[A] = js.Function1[/* signal */ typingsSlinky.wonka.wonkaTypesMod.Signal[A], scala.Unit]
  
  type Source[A] = js.Function1[/* sink */ typingsSlinky.wonka.wonkaTypesMod.Sink[A], scala.Unit]
  
  type Subject[A] = js.Tuple3[
    typingsSlinky.wonka.wonkaTypesMod.Source[A], 
    js.Function1[/* value */ A, scala.Unit], 
    js.Function0[scala.Unit]
  ]
  
  type Subscription = js.Array[js.Function0[scala.Unit]]
}
