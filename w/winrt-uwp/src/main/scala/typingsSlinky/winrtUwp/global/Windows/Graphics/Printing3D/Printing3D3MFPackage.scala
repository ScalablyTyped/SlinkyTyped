package typingsSlinky.winrtUwp.global.Windows.Graphics.Printing3D

import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a 3D Manufacturing Format (3MF) package. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3D3MFPackage")
@js.native
/** Creates a Printing3D3MFPackage object. */
class Printing3D3MFPackage ()
  extends typingsSlinky.winrtUwp.Windows.Graphics.Printing3D.Printing3D3MFPackage
/* static members */
@JSGlobal("Windows.Graphics.Printing3D.Printing3D3MFPackage")
@js.native
object Printing3D3MFPackage extends js.Object {
  
  /**
    * Creates a Printing3D3MFPackage object from a 3D Manufacturing Format (3MF) file stream.
    * @param value A 3MF file stream.
    * @return A Printing3D3MFPackage created from the specified 3MF package stream.
    */
  def loadAsync(value: IRandomAccessStream): IPromiseWithIAsyncOperation[typingsSlinky.winrtUwp.Windows.Graphics.Printing3D.Printing3D3MFPackage] = js.native
}
