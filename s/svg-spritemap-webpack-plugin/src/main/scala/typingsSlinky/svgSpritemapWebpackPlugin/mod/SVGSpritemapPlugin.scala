package typingsSlinky.svgSpritemapWebpackPlugin.mod

import typingsSlinky.std.Plugin
import typingsSlinky.svgSpritemapWebpackPlugin.anon.Assets
import typingsSlinky.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginStrings.asset
import typingsSlinky.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginStrings.dir
import typingsSlinky.svgSpritemapWebpackPlugin.svgSpritemapWebpackPluginStrings.module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGSpritemapPlugin extends Plugin {
  
  val directories: js.Array[String] = js.native
  
  val files: js.Array[String] = js.native
  
  /* private */ def getContentHash(source: String): String = js.native
  
  /* private */ def getSpritemapHashes(
    compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any
  ): js.Array[String] = js.native
  
  /* private */ def getStylesHashes(
    compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any
  ): js.Array[String] = js.native
  
  /* private */ def getStylesType(styles: js.Object): js.UndefOr[asset | dir | module] = js.native
  /* private */ def getStylesType(styles: js.Object, filename: String): js.UndefOr[asset | dir | module] = js.native
  
  /* private */ def hashFilename(fileaname: String): String = js.native
  /* private */ def hashFilename(fileaname: String, hashes: js.Array[String]): String = js.native
  
  /* private */ def rewriteAssetsHashes(filename: String): Assets = js.native
  /* private */ def rewriteAssetsHashes(filename: String, assets: js.UndefOr[scala.Nothing], hashes: js.Array[String]): Assets = js.native
  /* private */ def rewriteAssetsHashes(filename: String, assets: js.Object): Assets = js.native
  /* private */ def rewriteAssetsHashes(filename: String, assets: js.Object, hashes: js.Array[String]): Assets = js.native
  
  /* private */ def updateDependencies(): Unit = js.native
  
  /* private */ def writeStylesToDisk(styles: js.Object, `type`: String): Unit = js.native
}
