package typingsSlinky.zetapushJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsyncMacroServicePublisher = js.Function4[
    /* method */ java.lang.String, 
    /* parameters */ js.UndefOr[typingsSlinky.zetapushJs.mod.PublishParameters], 
    /* hardFail */ js.UndefOr[scala.Boolean], 
    /* debug */ js.UndefOr[scala.Double], 
    js.Promise[js.Any]
  ]
  
  type AuthenticationCallback = js.Function0[typingsSlinky.zetapushJs.mod.AbstractHandshake]
  
  type ConnectionStatusHandler = scala.Double
  
  type MacroServicePublisher = js.Function4[
    /* method */ java.lang.String, 
    /* parameters */ js.UndefOr[typingsSlinky.zetapushJs.mod.PublishParameters], 
    /* hardFail */ js.UndefOr[scala.Boolean], 
    /* debug */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  
  type PublishParameters = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ServicePublisher = js.Function2[/* method */ java.lang.String, /* parameters */ js.Any, scala.Unit]
}
