package typingsSlinky.tstl.mapContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object MapContainer {
  
  type InsertRet[Key, T, Unique /* <: scala.Boolean */, SourceT /* <: typingsSlinky.tstl.mapContainerMod.MapContainer[Key, T, Unique, SourceT, IteratorT, Reverse] */, IteratorT /* <: typingsSlinky.tstl.mapContainerMod.MapContainer.Iterator[Key, T, Unique, SourceT, IteratorT, Reverse] */, Reverse /* <: typingsSlinky.tstl.mapContainerMod.MapContainer.ReverseIterator[Key, T, Unique, SourceT, IteratorT, Reverse] */] = IteratorT | (typingsSlinky.tstl.pairMod.Pair[IteratorT, scala.Boolean])
}
