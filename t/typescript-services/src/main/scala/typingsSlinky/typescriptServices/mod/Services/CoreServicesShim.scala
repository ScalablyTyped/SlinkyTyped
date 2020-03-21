package typingsSlinky.typescriptServices.mod.Services

import typingsSlinky.typescriptServices.TypeScript.Services.ICoreServicesHost
import typingsSlinky.typescriptServices.TypeScript.Services.IShimFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.CoreServicesShim")
@js.native
class CoreServicesShim protected ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.CoreServicesShim {
  def this(factory: IShimFactory, host: ICoreServicesHost) = this()
}

