package typingsSlinky.webpackBlocksCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ConfigSetter[T /* <: typingsSlinky.webpackBlocksCore.mod.Context */] = js.Function2[
    /* context */ T, 
    /* util */ typingsSlinky.webpackBlocksCore.mod.Util, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ /* config */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration */ js.Any
    ]
  ]
}
