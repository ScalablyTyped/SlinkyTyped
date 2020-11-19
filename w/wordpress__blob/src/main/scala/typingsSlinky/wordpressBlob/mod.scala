package typingsSlinky.wordpressBlob

import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blob", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createBlobURL(file: File): String = js.native
  
  def getBlobByURL(url: String): js.UndefOr[File] = js.native
  
  def isBlobURL(url: String): Boolean = js.native
  
  def revokeBlobURL(url: String): Unit = js.native
}
