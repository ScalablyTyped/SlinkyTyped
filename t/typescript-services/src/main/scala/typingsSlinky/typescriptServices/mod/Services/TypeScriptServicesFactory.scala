package typingsSlinky.typescriptServices.mod.Services

import typingsSlinky.typescriptServices.TypeScript.Services.IClassifierHost
import typingsSlinky.typescriptServices.TypeScript.Services.ICoreServicesHost
import typingsSlinky.typescriptServices.TypeScript.Services.ILanguageService
import typingsSlinky.typescriptServices.TypeScript.Services.ILanguageServiceHost
import typingsSlinky.typescriptServices.TypeScript.Services.ILanguageServiceShim
import typingsSlinky.typescriptServices.TypeScript.Services.ILanguageServiceShimHost
import typingsSlinky.typescriptServices.TypeScript.Services.IShim
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.TypeScriptServicesFactory")
@js.native
class TypeScriptServicesFactory ()
  extends typingsSlinky.typescriptServices.TypeScript.Services.TypeScriptServicesFactory {
  /* CompleteClass */
  override var _shims: js.Any = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def createClassifier(host: IClassifierHost): typingsSlinky.typescriptServices.TypeScript.Services.Classifier = js.native
  /* CompleteClass */
  override def createClassifierShim(host: IClassifierHost): typingsSlinky.typescriptServices.TypeScript.Services.ClassifierShim = js.native
  /* CompleteClass */
  override def createCoreServices(host: ICoreServicesHost): typingsSlinky.typescriptServices.TypeScript.Services.CoreServices = js.native
  /* CompleteClass */
  override def createCoreServicesShim(host: ICoreServicesHost): typingsSlinky.typescriptServices.TypeScript.Services.CoreServicesShim = js.native
  /* CompleteClass */
  override def createLanguageServiceShim(host: ILanguageServiceShimHost): ILanguageServiceShim = js.native
  /* CompleteClass */
  override def createPullLanguageService(host: ILanguageServiceHost): ILanguageService = js.native
  /* CompleteClass */
  override def registerShim(shim: IShim): Unit = js.native
  /* CompleteClass */
  override def unregisterShim(shim: IShim): Unit = js.native
}

