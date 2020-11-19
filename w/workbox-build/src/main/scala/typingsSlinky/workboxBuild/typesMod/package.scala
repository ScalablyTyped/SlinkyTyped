package typingsSlinky.workboxBuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ManifestTransform = js.Function2[
    /* manifestEntries */ js.Array[typingsSlinky.workboxBuild.typesMod.ManifestEntry], 
    /* compilation */ js.UndefOr[js.Object], 
    js.Promise[typingsSlinky.workboxBuild.typesMod.ManifestTransformResult]
  ]
}
