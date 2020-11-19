package typingsSlinky.wonka

import typingsSlinky.wonka.reasonPervasivesShimMod.list
import typingsSlinky.wonka.wonkaTypesGenMod.observerT
import typingsSlinky.wonka.wonkaTypesGenMod.sinkT
import typingsSlinky.wonka.wonkaTypesGenMod.sourceT
import typingsSlinky.wonka.wonkaTypesGenMod.subjectT
import typingsSlinky.wonka.wonkaTypesGenMod.teardownT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/dist/types/src/Wonka_sources.gen", JSImport.Namespace)
@js.native
object wonkaSourcesGenMod extends js.Object {
  
  def empty[a](sink: sinkT[a]): Unit = js.native
  
  def fromArray[a](arr: js.Array[a]): sourceT[a] = js.native
  
  def fromList[a](ls: list[a]): sourceT[a] = js.native
  
  def fromValue[a](x: a): sourceT[a] = js.native
  
  def make[a](f: js.Function1[/* _1 */ observerT[a], teardownT]): sourceT[a] = js.native
  
  def makeSubject[a](): subjectT[a] = js.native
  
  def never[a](sink: sinkT[a]): Unit = js.native
}
