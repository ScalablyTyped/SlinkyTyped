package typingsSlinky.tabris

import typingsSlinky.tabris.tabrisStrings.`force-cache`
import typingsSlinky.tabris.tabrisStrings.`import`
import typingsSlinky.tabris.tabrisStrings.`no-cache`
import typingsSlinky.tabris.tabrisStrings.`no-cors`
import typingsSlinky.tabris.tabrisStrings.`no-store`
import typingsSlinky.tabris.tabrisStrings.`object`
import typingsSlinky.tabris.tabrisStrings.`only-if-cached`
import typingsSlinky.tabris.tabrisStrings.`same-origin`
import typingsSlinky.tabris.tabrisStrings.audio
import typingsSlinky.tabris.tabrisStrings.beacon
import typingsSlinky.tabris.tabrisStrings.cors
import typingsSlinky.tabris.tabrisStrings.cspreport
import typingsSlinky.tabris.tabrisStrings.default
import typingsSlinky.tabris.tabrisStrings.download
import typingsSlinky.tabris.tabrisStrings.embed
import typingsSlinky.tabris.tabrisStrings.eventsource
import typingsSlinky.tabris.tabrisStrings.favicon
import typingsSlinky.tabris.tabrisStrings.fetch
import typingsSlinky.tabris.tabrisStrings.font
import typingsSlinky.tabris.tabrisStrings.form
import typingsSlinky.tabris.tabrisStrings.frame
import typingsSlinky.tabris.tabrisStrings.hyperlink
import typingsSlinky.tabris.tabrisStrings.iframe
import typingsSlinky.tabris.tabrisStrings.image
import typingsSlinky.tabris.tabrisStrings.imageset
import typingsSlinky.tabris.tabrisStrings.include
import typingsSlinky.tabris.tabrisStrings.internal
import typingsSlinky.tabris.tabrisStrings.location
import typingsSlinky.tabris.tabrisStrings.manifest
import typingsSlinky.tabris.tabrisStrings.omit
import typingsSlinky.tabris.tabrisStrings.ping
import typingsSlinky.tabris.tabrisStrings.plugin
import typingsSlinky.tabris.tabrisStrings.prefetch
import typingsSlinky.tabris.tabrisStrings.reload
import typingsSlinky.tabris.tabrisStrings.script
import typingsSlinky.tabris.tabrisStrings.serviceworker
import typingsSlinky.tabris.tabrisStrings.sharedworker
import typingsSlinky.tabris.tabrisStrings.style
import typingsSlinky.tabris.tabrisStrings.subresource
import typingsSlinky.tabris.tabrisStrings.track
import typingsSlinky.tabris.tabrisStrings.video
import typingsSlinky.tabris.tabrisStrings.worker
import typingsSlinky.tabris.tabrisStrings.xmlhttprequest
import typingsSlinky.tabris.tabrisStrings.xslt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Request
/**
  * Represents an HTTP Request as used by `fetch()`.
  */
@js.native
trait Request extends js.Object {
  val bodyUsed: Boolean = js.native
  val cash: default | `force-cache` | `no-cache` | `no-store` | `only-if-cached` | reload = js.native
  val context: audio | beacon | cspreport | download | embed | eventsource | favicon | fetch | font | form | frame | hyperlink | iframe | image | imageset | `import` | internal | location | manifest | `object` | ping | plugin | prefetch | script | serviceworker | sharedworker | style | subresource | track | video | worker | xmlhttprequest | xslt = js.native
  val credentials: include | omit | `same-origin` = js.native
  val headers: Headers = js.native
  val method: String = js.native
  val mode: cors | `no-cors` | `same-origin` = js.native
  val referrer: String = js.native
  val url: String = js.native
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def blob(): js.Promise[Blob] = js.native
  def json(): js.Promise[_] = js.native
  @JSName("json")
  def json_T[T](): js.Promise[T] = js.native
  def text(): js.Promise[String] = js.native
}

