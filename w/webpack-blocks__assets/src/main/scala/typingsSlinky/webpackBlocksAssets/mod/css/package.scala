package typingsSlinky.webpackBlocksAssets.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object css {
  
  type GetLocalIdent = js.Function4[
    /* context */ js.Any, 
    /* localIdentName */ js.Any, 
    /* localName */ js.Any, 
    /* options */ js.Any, 
    java.lang.String
  ]
  
  type ImportFilter = js.Function2[
    /* parseImport */ typingsSlinky.webpackBlocksAssets.mod.css.ParseImportOptions, 
    /* resourcePath */ java.lang.String, 
    scala.Boolean
  ]
  
  type NameFunction = js.Function1[/* file */ java.lang.String, js.Any]
  
  type PathFunction = js.Function3[
    /* url */ java.lang.String, 
    /* resourcePath */ java.lang.String, 
    /* context */ java.lang.String, 
    js.Any
  ]
  
  type UrlFilter = js.Function2[/* url */ java.lang.String, /* resourcePath */ java.lang.String, scala.Boolean]
}
