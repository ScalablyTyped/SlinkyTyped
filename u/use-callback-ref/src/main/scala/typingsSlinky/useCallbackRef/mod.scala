package typingsSlinky.useCallbackRef

import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.useCallbackRef.typesMod.ReactRef
import typingsSlinky.useCallbackRef.typesMod.RefCallback
import typingsSlinky.useCallbackRef.typesMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("use-callback-ref", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def assignRef[T](ref: ReactRef[T]): ReactRef[T] = js.native
  def assignRef[T](ref: ReactRef[T], value: T): ReactRef[T] = js.native
  
  def createCallbackRef[T](callback: js.Function2[/* newValue */ T | Null, /* lastValue */ T | Null, _]): slinky.core.facade.ReactRef[T] = js.native
  
  def mergeRefs[T](refs: js.Array[ReactRef[T]]): MutableRefObject[T | Null] = js.native
  
  def refToCallback[T](ref: ReactRef[T]): RefCallback[T] = js.native
  
  def transformRef[T, K](ref: ReactRef[K], transformer: js.Function1[/* original */ T, K]): RefObject[T] = js.native
  
  def useCallbackRef[T](initialValue: T, callback: js.Function2[/* newValue */ T | Null, /* lastValue */ T | Null, Unit]): MutableRefObject[T | Null] = js.native
  def useCallbackRef[T](
    initialValue: Null,
    callback: js.Function2[/* newValue */ T | Null, /* lastValue */ T | Null, Unit]
  ): MutableRefObject[T | Null] = js.native
  
  def useMergeRefs[T](refs: js.Array[ReactRef[T]]): MutableRefObject[T | Null] = js.native
  def useMergeRefs[T](refs: js.Array[ReactRef[T]], defaultValue: T): MutableRefObject[T | Null] = js.native
  
  def useRefToCallback[T](ref: ReactRef[T]): RefCallback[T] = js.native
  
  def useTransformRef[T, K](ref: ReactRef[K], transformer: js.Function1[/* original */ T, K]): RefObject[T] = js.native
}
