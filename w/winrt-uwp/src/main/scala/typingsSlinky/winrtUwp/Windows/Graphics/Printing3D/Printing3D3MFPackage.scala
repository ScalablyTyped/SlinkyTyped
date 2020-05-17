package typingsSlinky.winrtUwp.Windows.Graphics.Printing3D

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a 3D Manufacturing Format (3MF) package. */
@js.native
trait Printing3D3MFPackage extends js.Object {
  /** Gets or sets an XML stream to the 3D model in the 3D Manufacturing Format (3MF) package. */
  var modelPart: IRandomAccessStream = js.native
  /** Gets or sets a stream to the print ticket in the 3D Manufacturing Format (3MF) package. */
  var printTicket: IRandomAccessStream = js.native
  /** Gets or sets the textures in the 3D Manufacturing Format (3MF) package. */
  var textures: IVector[Printing3DTextureResource] = js.native
  /** Gets or sets a thumbnail image that represents the contents of the 3D Manufacturing Format (3MF) package. */
  var thumbnail: Printing3DTextureResource = js.native
  /**
    * Creates a Printing3DModel object from a 3D Manufacturing Format (3MF) file stream.
    * @param value A 3MF file stream.
    * @return A Printing3DModel object created from the specified 3MF object stream.
    */
  def loadModelFromPackageAsync(value: IRandomAccessStream): IPromiseWithIAsyncOperation[Printing3DModel] = js.native
  /**
    * Saves the Printing3D3MFPackage object to a 3D Manufacturing Format (3MF) file stream.
    * @return A stream to the 3MF file where the package is to be saved.
    */
  def saveAsync(): IPromiseWithIAsyncOperation[IRandomAccessStream] = js.native
  /**
    * Saves the specified 3D model to the 3D Manufacturing Format (3MF) package.
    * @param value The 3D model to be saved to the 3MF package.
    * @return The results of the operation.
    */
  def saveModelToPackageAsync(value: Printing3DModel): IPromiseWithIAsyncAction = js.native
}

object Printing3D3MFPackage {
  @scala.inline
  def apply(
    loadModelFromPackageAsync: IRandomAccessStream => IPromiseWithIAsyncOperation[Printing3DModel],
    modelPart: IRandomAccessStream,
    printTicket: IRandomAccessStream,
    saveAsync: () => IPromiseWithIAsyncOperation[IRandomAccessStream],
    saveModelToPackageAsync: Printing3DModel => IPromiseWithIAsyncAction,
    textures: IVector[Printing3DTextureResource],
    thumbnail: Printing3DTextureResource
  ): Printing3D3MFPackage = {
    val __obj = js.Dynamic.literal(loadModelFromPackageAsync = js.Any.fromFunction1(loadModelFromPackageAsync), modelPart = modelPart.asInstanceOf[js.Any], printTicket = printTicket.asInstanceOf[js.Any], saveAsync = js.Any.fromFunction0(saveAsync), saveModelToPackageAsync = js.Any.fromFunction1(saveModelToPackageAsync), textures = textures.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3D3MFPackage]
  }
  @scala.inline
  implicit class Printing3D3MFPackageOps[Self <: Printing3D3MFPackage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadModelFromPackageAsync(value: IRandomAccessStream => IPromiseWithIAsyncOperation[Printing3DModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadModelFromPackageAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withModelPart(value: IRandomAccessStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelPart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintTicket(value: IRandomAccessStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printTicket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaveAsync(value: () => IPromiseWithIAsyncOperation[IRandomAccessStream]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSaveModelToPackageAsync(value: Printing3DModel => IPromiseWithIAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveModelToPackageAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTextures(value: IVector[Printing3DTextureResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail(value: Printing3DTextureResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

