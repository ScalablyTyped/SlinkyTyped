package typingsSlinky.tabris.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.tabris.Blob
import typingsSlinky.tabris.FormData
import typingsSlinky.tabris.ResponseInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Response")
@js.native
class Response ()
  extends typingsSlinky.tabris.Response {
  def this(body: String) = this()
  def this(body: Blob) = this()
  def this(body: FormData) = this()
  def this(body: String, init: ResponseInit) = this()
  def this(body: Blob, init: ResponseInit) = this()
  def this(body: FormData, init: ResponseInit) = this()
}

@JSImport("tabris", "Response")
@js.native
object Response
  extends Instantiable0[typingsSlinky.tabris.Response]
     with Instantiable1[
      (/* body */ Blob) | (/* body */ FormData) | (/* body */ String), 
      typingsSlinky.tabris.Response
    ]
     with Instantiable2[
      (/* body */ Blob) | (/* body */ FormData) | (/* body */ String), 
      /* init */ ResponseInit, 
      typingsSlinky.tabris.Response
    ] {
  def error(): typingsSlinky.tabris.Response = js.native
  def redirect(url: String, status: Double): typingsSlinky.tabris.Response = js.native
}

