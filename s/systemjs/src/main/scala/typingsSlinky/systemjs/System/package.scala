package typingsSlinky.systemjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object System {
  
  type DeclareFn = js.Function2[
    /* _export */ typingsSlinky.systemjs.System.ExportFn, 
    /* _context */ typingsSlinky.systemjs.System.Context, 
    typingsSlinky.systemjs.System.Declare
  ]
  
  type ExecuteFn = js.Function0[js.Any]
  
  type GetFn = typingsSlinky.systemjs.System.GetFnModule | typingsSlinky.systemjs.System.GetFnGeneric
  
  // tslint:disable-next-line no-unnecessary-generics
  type GetFnGeneric = js.Function1[/* moduleId */ java.lang.String, js.Any]
  
  type GetFnModule = js.Function1[/* moduleId */ java.lang.String, typingsSlinky.systemjs.System.Module]
  
  // tslint:disable-next-line no-unnecessary-generics
  type ImportFn = js.Function2[
    /* moduleId */ java.lang.String, 
    /* parentUrl */ js.UndefOr[java.lang.String], 
    js.Promise[typingsSlinky.systemjs.System.Module]
  ]
  
  type SetterFn = js.Function1[/* moduleValue */ typingsSlinky.systemjs.System.Module, js.Any]
  
  type UpdateModuleFn = js.Function0[scala.Unit]
}
