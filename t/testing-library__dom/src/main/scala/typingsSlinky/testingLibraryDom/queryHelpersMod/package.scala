package typingsSlinky.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object queryHelpersMod {
  
  type AllByAttribute = js.Function4[
    /* attribute */ java.lang.String, 
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsSlinky.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsSlinky.testingLibraryDom.matchesMod.MatcherOptions], 
    js.Array[org.scalajs.dom.raw.HTMLElement]
  ]
  
  type BuiltQueryMethods[Arguments /* <: js.Array[_] */] = js.Tuple5[
    typingsSlinky.testingLibraryDom.queryHelpersMod.QueryBy[Arguments], 
    typingsSlinky.testingLibraryDom.queryHelpersMod.GetAllBy[Arguments], 
    typingsSlinky.testingLibraryDom.queryHelpersMod.GetBy[Arguments], 
    typingsSlinky.testingLibraryDom.queryHelpersMod.FindAllBy[Arguments], 
    typingsSlinky.testingLibraryDom.queryHelpersMod.FindBy[Arguments]
  ]
  
  type FindAllBy[Arguments /* <: js.Array[_] */] = typingsSlinky.testingLibraryDom.queryHelpersMod.QueryMethod[
    js.Tuple3[
      /* import warning: importer.ImportType#apply Failed type conversion: Arguments[0] */ js.Any, 
      js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: Arguments[1] */ js.Any
      ], 
      js.UndefOr[typingsSlinky.testingLibraryDom.waitForMod.waitForOptions]
    ], 
    js.Promise[js.Array[org.scalajs.dom.raw.HTMLElement]]
  ]
  
  type FindBy[Arguments /* <: js.Array[_] */] = typingsSlinky.testingLibraryDom.queryHelpersMod.QueryMethod[
    js.Tuple3[
      /* import warning: importer.ImportType#apply Failed type conversion: Arguments[0] */ js.Any, 
      js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: Arguments[1] */ js.Any
      ], 
      js.UndefOr[typingsSlinky.testingLibraryDom.waitForMod.waitForOptions]
    ], 
    js.Promise[org.scalajs.dom.raw.HTMLElement]
  ]
  
  type GetAllBy[Arguments /* <: js.Array[_] */] = typingsSlinky.testingLibraryDom.queryHelpersMod.QueryMethod[Arguments, js.Array[org.scalajs.dom.raw.HTMLElement]]
  
  type GetBy[Arguments /* <: js.Array[_] */] = typingsSlinky.testingLibraryDom.queryHelpersMod.QueryMethod[Arguments, org.scalajs.dom.raw.HTMLElement]
  
  type QueryBy[Arguments /* <: js.Array[_] */] = typingsSlinky.testingLibraryDom.queryHelpersMod.QueryMethod[Arguments, org.scalajs.dom.raw.HTMLElement | scala.Null]
  
  type QueryByAttribute_ = js.Function4[
    /* attribute */ java.lang.String, 
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsSlinky.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsSlinky.testingLibraryDom.matchesMod.MatcherOptions], 
    org.scalajs.dom.raw.HTMLElement | scala.Null
  ]
  
  type QueryMethod[Arguments /* <: js.Array[_] */, Return] = js.Function2[/* container */ org.scalajs.dom.raw.HTMLElement, /* args */ Arguments, Return]
}
