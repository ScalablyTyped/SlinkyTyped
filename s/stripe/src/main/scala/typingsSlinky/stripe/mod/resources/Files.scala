package typingsSlinky.stripe.mod.resources

import typingsSlinky.stripe.mod.HeaderOptions
import typingsSlinky.stripe.mod.IDataOptions
import typingsSlinky.stripe.mod.IList
import typingsSlinky.stripe.mod.IListPromise
import typingsSlinky.stripe.mod.IResponseFn
import typingsSlinky.stripe.mod.StripeResource
import typingsSlinky.stripe.mod.files.IFileCreationOptions
import typingsSlinky.stripe.mod.files.IFileListOptions
import typingsSlinky.stripe.mod.files.IFileUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", "resources.Files")
@js.native
class Files () extends StripeResource {
  
  def create(data: IFileCreationOptions): js.Promise[IFileUpdate] = js.native
  /**
    * To upload a file to Stripe, you’ll need to send a request of type multipart/form-data.
    * The request should contain the file you would like to upload, as well as the parameters for creating a file.
    *
    * All of Stripe’s officially supported API libraries should have support for sending multipart/form-data.
    */
  def create(data: IFileCreationOptions, options: HeaderOptions): js.Promise[IFileUpdate] = js.native
  def create(data: IFileCreationOptions, options: HeaderOptions, response: IResponseFn[IFileUpdate]): js.Promise[IFileUpdate] = js.native
  def create(data: IFileCreationOptions, response: IResponseFn[IFileUpdate]): js.Promise[IFileUpdate] = js.native
  
  def list(): IListPromise[IFileUpdate] = js.native
  def list(data: IFileListOptions): IListPromise[IFileUpdate] = js.native
  /**
    * Returns a list of the files that you have uploaded to Stripe.
    * The files are returned sorted by creation date, with the most recently created files appearing first.
    */
  def list(data: IFileListOptions, options: HeaderOptions): IListPromise[IFileUpdate] = js.native
  def list(data: IFileListOptions, options: HeaderOptions, response: IResponseFn[IList[IFileUpdate]]): IListPromise[IFileUpdate] = js.native
  def list(data: IFileListOptions, response: IResponseFn[IList[IFileUpdate]]): IListPromise[IFileUpdate] = js.native
  def list(options: HeaderOptions): IListPromise[IFileUpdate] = js.native
  def list(options: HeaderOptions, response: IResponseFn[IList[IFileUpdate]]): IListPromise[IFileUpdate] = js.native
  def list(response: IResponseFn[IList[IFileUpdate]]): IListPromise[IFileUpdate] = js.native
  
  def retrieve(id: String): js.Promise[IFileUpdate] = js.native
  def retrieve(id: String, data: IDataOptions): js.Promise[IFileUpdate] = js.native
  /**
    * Retrieves the details of an existing file object.
    * Supply the unique file ID from a file creation request, and Stripe will return the corresponding transfer information.
    */
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions): js.Promise[IFileUpdate] = js.native
  def retrieve(id: String, data: IDataOptions, options: HeaderOptions, response: IResponseFn[IFileUpdate]): js.Promise[IFileUpdate] = js.native
  def retrieve(id: String, data: IDataOptions, response: IResponseFn[IFileUpdate]): js.Promise[IFileUpdate] = js.native
  def retrieve(id: String, options: HeaderOptions): js.Promise[IFileUpdate] = js.native
  def retrieve(id: String, options: HeaderOptions, response: IResponseFn[IFileUpdate]): js.Promise[IFileUpdate] = js.native
  def retrieve(id: String, response: IResponseFn[IFileUpdate]): js.Promise[IFileUpdate] = js.native
}
