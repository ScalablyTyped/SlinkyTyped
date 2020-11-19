package typingsSlinky.sugarCore.sugarjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sugar extends js.Object {
  
  def apply(): Sugar = js.native
  def apply(opts: ExtendOptions): Sugar = js.native
  
  var Array: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Array.Constructor */ js.Any = js.native
  
  var Date: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Date.Constructor */ js.Any = js.native
  
  var Function: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Function.Constructor */ js.Any = js.native
  
  var Number: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Number.Constructor */ js.Any = js.native
  
  var Object: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Object.Constructor */ js.Any = js.native
  
  var RegExp: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RegExp.Constructor */ js.Any = js.native
  
  var String: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify String.Constructor */ js.Any = js.native
  
  def createNamespace(name: java.lang.String): SugarNamespace = js.native
  
  def extend(): Sugar = js.native
  def extend(opts: ExtendOptions): Sugar = js.native
}
