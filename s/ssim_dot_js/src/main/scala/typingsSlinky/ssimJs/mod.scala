package typingsSlinky.ssimJs

import typingsSlinky.ssimJs.anon.Mssim
import typingsSlinky.ssimJs.anon.PartialOptions
import typingsSlinky.ssimJs.typesMod.ImageData
import typingsSlinky.ssimJs.typesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssim.js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(image1: ImageData, image2: ImageData): Mssim = js.native
  def default(image1: ImageData, image2: ImageData, userOptions: PartialOptions): Mssim = js.native
  
  def getOptions(): Options = js.native
  def getOptions(userOptions: PartialOptions): Options = js.native
  
  def ssim(image1: ImageData, image2: ImageData): Mssim = js.native
  def ssim(image1: ImageData, image2: ImageData, userOptions: PartialOptions): Mssim = js.native
}
