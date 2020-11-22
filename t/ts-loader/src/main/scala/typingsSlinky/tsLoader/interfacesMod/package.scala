package typingsSlinky.tsLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interfacesMod {
  
  type CustomResolveModuleName = js.Function5[
    /* moduleName */ java.lang.String, 
    /* containingFile */ java.lang.String, 
    /* compilerOptions */ typingsSlinky.typescript.mod.CompilerOptions, 
    /* moduleResolutionHost */ typingsSlinky.typescript.mod.ModuleResolutionHost, 
    /* parentResolver */ typingsSlinky.tsLoader.interfacesMod.ResolveModuleName, 
    typingsSlinky.typescript.mod.ResolvedModuleWithFailedLookupLocations
  ]
  
  type CustomResolveTypeReferenceDirective = js.Function5[
    /* typeDirectiveName */ java.lang.String, 
    /* containingFile */ java.lang.String, 
    /* compilerOptions */ typingsSlinky.typescript.mod.CompilerOptions, 
    /* moduleResolutionHost */ typingsSlinky.typescript.mod.ModuleResolutionHost, 
    /* parentResolver */ typingsSlinky.tsLoader.anon.FnCall, 
    typingsSlinky.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
  ]
  
  type DependencyGraph = org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Array[typingsSlinky.tsLoader.interfacesMod.ResolvedModule]]]
  
  type LoaderOptionsCache = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.std.WeakMap[
      typingsSlinky.tsLoader.interfacesMod.LoaderOptions, 
      typingsSlinky.tsLoader.interfacesMod.LoaderOptions
    ]
  ]
  
  type ResolveModuleName = js.Function4[
    /* moduleName */ java.lang.String, 
    /* containingFile */ java.lang.String, 
    /* compilerOptions */ typingsSlinky.typescript.mod.CompilerOptions, 
    /* moduleResolutionHost */ typingsSlinky.typescript.mod.ModuleResolutionHost, 
    typingsSlinky.typescript.mod.ResolvedModuleWithFailedLookupLocations
  ]
  
  type ResolveSync = js.Function3[
    /* context */ js.UndefOr[java.lang.String], 
    /* path */ java.lang.String, 
    /* moduleName */ java.lang.String, 
    java.lang.String
  ]
  
  type ReverseDependencyGraph = org.scalablytyped.runtime.StringDictionary[js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]]]
  
  type TSFiles = typingsSlinky.std.Map[java.lang.String, typingsSlinky.tsLoader.interfacesMod.TSFile]
  
  type TSInstances = org.scalablytyped.runtime.StringDictionary[typingsSlinky.tsLoader.interfacesMod.TSInstance]
  
  type WatchCallbacks[T] = typingsSlinky.std.Map[java.lang.String, js.Array[T]]
}
