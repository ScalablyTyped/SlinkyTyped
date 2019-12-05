package typingsSlinky.stripe.stripeMod.resources

import typingsSlinky.stripe.stripeMod.HeaderOptions
import typingsSlinky.stripe.stripeMod.IResponseFn
import typingsSlinky.stripe.stripeMod.StripeResource
import typingsSlinky.stripe.stripeMod.sources.ISourceCreationOptions
import typingsSlinky.stripe.stripeMod.sources.ISourceRetrieveOptions
import typingsSlinky.stripe.stripeMod.sources.ISourceUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stripe", "resources.Sources")
@js.native
class Sources () extends StripeResource {
  def create(data: ISourceCreationOptions): js.Promise[typingsSlinky.stripe.stripeMod.sources.ISource] = js.native
  /** Create Source: https://stripe.com/docs/api/sources/create */
  def create(data: ISourceCreationOptions, options: HeaderOptions): js.Promise[typingsSlinky.stripe.stripeMod.sources.ISource] = js.native
  def create(
    data: ISourceCreationOptions,
    options: HeaderOptions,
    response: IResponseFn[typingsSlinky.stripe.stripeMod.sources.ISource]
  ): js.Promise[typingsSlinky.stripe.stripeMod.sources.ISource] = js.native
  def create(
    data: ISourceCreationOptions,
    response: IResponseFn[typingsSlinky.stripe.stripeMod.sources.ISource]
  ): js.Promise[typingsSlinky.stripe.stripeMod.sources.ISource] = js.native
  def retrieve(id: String): js.Promise[typingsSlinky.stripe.stripeMod.sources.ISource] = js.native
  def retrieve(id: String, data: js.UndefOr[scala.Nothing], options: HeaderOptions): js.Promise[typingsSlinky.stripe.stripeMod.sources.ISource] = js.native
  def retrieve(
    id: String,
    data: js.UndefOr[scala.Nothing],
    options: HeaderOptions,
    response: IResponseFn[typingsSlinky.stripe.stripeMod.sources.ISource]
  ): js.Promise[typingsSlinky.stripe.stripeMod.sources.ISource] = js.native
  def retrieve(id: String, data: ISourceRetrieveOptions): js.Promise[typingsSlinky.stripe.stripeMod.sources.ISource] = js.native
  /** Retrieve Source: https://stripe.com/docs/api/sources/retrieve */
  def retrieve(id: String, data: ISourceRetrieveOptions, options: HeaderOptions): js.Promise[typingsSlinky.stripe.stripeMod.sources.ISource] = js.native
  def retrieve(
    id: String,
    data: ISourceRetrieveOptions,
    options: HeaderOptions,
    response: IResponseFn[typingsSlinky.stripe.stripeMod.sources.ISource]
  ): js.Promise[typingsSlinky.stripe.stripeMod.sources.ISource] = js.native
  def retrieve(
    id: String,
    data: ISourceRetrieveOptions,
    response: IResponseFn[typingsSlinky.stripe.stripeMod.sources.ISource]
  ): js.Promise[typingsSlinky.stripe.stripeMod.sources.ISource] = js.native
  def update(id: String, data: ISourceUpdateOptions): js.Promise[typingsSlinky.stripe.stripeMod.sources.ISource] = js.native
  /** Update Source: https://stripe.com/docs/api/sources/update */
  def update(id: String, data: ISourceUpdateOptions, options: HeaderOptions): js.Promise[typingsSlinky.stripe.stripeMod.sources.ISource] = js.native
  def update(
    id: String,
    data: ISourceUpdateOptions,
    options: HeaderOptions,
    response: IResponseFn[typingsSlinky.stripe.stripeMod.sources.ISource]
  ): js.Promise[typingsSlinky.stripe.stripeMod.sources.ISource] = js.native
  def update(
    id: String,
    data: ISourceUpdateOptions,
    response: IResponseFn[typingsSlinky.stripe.stripeMod.sources.ISource]
  ): js.Promise[typingsSlinky.stripe.stripeMod.sources.ISource] = js.native
}

