package typingsSlinky.wkhtmltopdf

import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.A0
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.A1
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.A2
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.A3
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.A4
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.A5
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.A6
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.A7
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.A8
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.A9
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.B0
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.B1
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.B10
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.B2
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.B3
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.B4
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.B5
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.B6
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.B7
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.B8
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.B9
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.C5E
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.Comm10E
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.DLE
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.Executive
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.Folio
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.Landscape
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.Ledger
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.Legal
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.Letter
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.Portrait
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.Tabloid
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.abort
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.error
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.ignore
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.info
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.none
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.skip
import typingsSlinky.wkhtmltopdf.wkhtmltopdfStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Call wkhtmltopdf and write PDF directly to specified file
    *
    * @param html HTML to convert to PDF
    * @param [options] Options without the output parameter
    */
  @JSImport("wkhtmltopdf", JSImport.Namespace)
  @js.native
  def apply(html: String): ReadWriteStream = js.native
  @JSImport("wkhtmltopdf", JSImport.Namespace)
  @js.native
  def apply(html: String, options: Options): ReadWriteStream = js.native
  /**
    * Call wkhtmltopdf with a callback
    *
    * @param html HTML that needs to be compiled to PDF
    * @param options Options without the output parameter
    * @param callback Callback function to handle the incoming PDF
    */
  @JSImport("wkhtmltopdf", JSImport.Namespace)
  @js.native
  def apply(
    html: String,
    options: Options,
    callback: js.Function2[/* err */ js.Error, /* stream */ ReadWriteStream, Unit]
  ): Unit = js.native
  /**
    * Call wkhtmltopdf and write PDF directly to specified file
    *
    * @param url URL to convert to PDF
    * @param options Options with the output parameter
    */
  @JSImport("wkhtmltopdf", JSImport.Namespace)
  @js.native
  def apply(url: String, options: OptionsOutfile): Unit = js.native
  
  @JSImport("wkhtmltopdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Set the path to the wkhtmltopdf executable
    * Default: wkhtmltopdf
    */
  @JSImport("wkhtmltopdf", "command")
  @js.native
  def command: String = js.native
  @scala.inline
  def command_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("command")(x.asInstanceOf[js.Any])
  
  /**
    * Set the path to the shell where wkhtmltopdf gets executed in
    * Default: /bin/bash
    */
  @JSImport("wkhtmltopdf", "shell")
  @js.native
  def shell: String = js.native
  @scala.inline
  def shell_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shell")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Options extends StObject {
    
    /****************
      * Page options *
      ****************/
    /** Allow the file or files from the specified folder to be loaded (repeatable) */
    var allow: js.UndefOr[js.Array[String]] = js.native
    
    /** Do print background (default) */
    var background: js.UndefOr[Boolean] = js.native
    
    /** Bypass proxy for host (repeatable) */
    var bypassProxyFor: js.UndefOr[js.Array[String]] = js.native
    
    /** Web cache directory */
    var cacheDir: js.UndefOr[String] = js.native
    
    /** Use this SVG file when rendering checked checkboxes */
    var checkboxCheckedSvg: js.UndefOr[String] = js.native
    
    /** Use this SVG file when rendering unchecked checkboxes */
    var checkboxSvg: js.UndefOr[String] = js.native
    
    /******************
      * Global options *
      ******************/
    /** Collate when printing multiple copies (default) */
    var collate: js.UndefOr[Boolean] = js.native
    
    /** Set an additional cookie (repeatable), value should be url encoded. */
    var cookie: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.native
    
    /** Number of copies to print into the pdf file (default 1) */
    var copies: js.UndefOr[Double] = js.native
    
    /**************************************
      * Special keys for node implementation
      **************************************/
    /** Cover object */
    var cover: js.UndefOr[String] = js.native
    
    /** Set an additional HTTP header (repeatable) */
    var customHeader: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.native
    
    /** Add HTTP headers specified by --custom-header for each resource request. */
    var customHeaderPropagation: js.UndefOr[Boolean] = js.native
    
    /** Debug prints stderr messages */
    var debug: js.UndefOr[Boolean] = js.native
    
    /** Show javascript debugging output */
    var debugJavascript: js.UndefOr[Boolean] = js.native
    
    /** debugStdOut prints any stdout warning messages */
    var debugStdOut: js.UndefOr[Boolean] = js.native
    
    /**
      * Add a default header, with the name of the page to the left, and the page number to the right, this is short for:
      * --header-left='[webpage]'
      * --header-right='[page]/[toPage]' --top 2cm
      * --header-line
      */
    var defaultHeader: js.UndefOr[Boolean] = js.native
    
    /***************
      * TOC options *
      ***************/
    /** Do not use dotted lines in the toc */
    var disableDottedLines: js.UndefOr[Boolean] = js.native
    
    /** Do not make links to remote web pages */
    var disableExternalLinks: js.UndefOr[Boolean] = js.native
    
    /** Do not turn HTML form fields into pdf form fields (default) */
    var disableForms: js.UndefOr[Boolean] = js.native
    
    /** Do not make local links */
    var disableInternalLinks: js.UndefOr[Boolean] = js.native
    
    /** Do not allow web pages to run javascript */
    var disableJavascript: js.UndefOr[Boolean] = js.native
    
    /** Do not allowed conversion of a local file to read in other local files, unless explicitly allowed with --allow (default) */
    var disableLocalFileAccess: js.UndefOr[Boolean] = js.native
    
    /** Disable installed plugins (default) */
    var disablePlugins: js.UndefOr[Boolean] = js.native
    
    /** Disable the intelligent shrinking strategy used by WebKit that makes the pixel/dpi ratio non-constant */
    var disableSmartShrinking: js.UndefOr[Boolean] = js.native
    
    /** Do not link from section header to toc (default) */
    var disableTocBackLinks: js.UndefOr[Boolean] = js.native
    
    /** Do not link from toc to sections */
    var disableTocLinks: js.UndefOr[Boolean] = js.native
    
    /** Change the dpi explicitly (this has no effect on X11 based systems) (default 96) */
    var dpi: js.UndefOr[Double] = js.native
    
    /*******************
      * Outline options *
      *******************/
    // Dump the default TOC xsl style sheet to stdout */
    var dumpDefaultTocXsl: js.UndefOr[Boolean] = js.native
    
    /** Dump the outline to a file */
    var dumpOutline: js.UndefOr[String] = js.native
    
    /** Make links to remote web pages (default) */
    var enableExternalLinks: js.UndefOr[Boolean] = js.native
    
    /** Turn HTML form fields into pdf form fields */
    var enableForms: js.UndefOr[Boolean] = js.native
    
    /** Make local links (default) */
    var enableInternalLinks: js.UndefOr[Boolean] = js.native
    
    /** Do allow web pages to run javascript (default) */
    var enableJavascript: js.UndefOr[Boolean] = js.native
    
    /** Allowed conversion of a local file to read in other local files. */
    var enableLocalFileAccess: js.UndefOr[Boolean] = js.native
    
    /** Enable installed plugins (plugins will likely not work) */
    var enablePlugins: js.UndefOr[Boolean] = js.native
    
    /** Enable the intelligent shrinking strategy used by WebKit that makes the pixel/dpi ratio non-constant (default) */
    var enableSmartShrinking: js.UndefOr[Boolean] = js.native
    
    /** Link from section header to toc */
    var enableTocBackLinks: js.UndefOr[Boolean] = js.native
    
    /** Set the default text encoding, for input */
    var encoding: js.UndefOr[String] = js.native
    
    /** Do not include the page in the table of contents and outlines */
    var excludeFromOutline: js.UndefOr[Boolean] = js.native
    
    /*****************************
      * Header and footer options *
      *****************************/
    /** Centered footer text */
    var footerCenter: js.UndefOr[String] = js.native
    
    /** Set footer font name (default Arial) */
    var footerFontName: js.UndefOr[String] = js.native
    
    /** Set footer font size (default 12) */
    var footerFontSize: js.UndefOr[Double] = js.native
    
    /** Adds a html footer should be an URL */
    var footerHtml: js.UndefOr[String] = js.native
    
    /** Left aligned footer text */
    var footerLeft: js.UndefOr[String] = js.native
    
    /** Display line above the footer */
    var footerLine: js.UndefOr[Boolean] = js.native
    
    /** Right aligned footer text */
    var footerRight: js.UndefOr[String] = js.native
    
    /** Spacing between footer and content in mm (e.g 10mm 2cm 0.5in) (default 0) */
    var footerSpacing: js.UndefOr[String] = js.native
    
    /** PDF will be generated in grayscale */
    var grayscale: js.UndefOr[Boolean] = js.native
    
    /** Centered header text */
    var headerCenter: js.UndefOr[String] = js.native
    
    /** Set header font name (default Arial) */
    var headerFontName: js.UndefOr[String] = js.native
    
    /** Set header font size (default 12) */
    var headerFontSize: js.UndefOr[Double] = js.native
    
    /** Adds a html header should be an URL */
    var headerHtml: js.UndefOr[String] = js.native
    
    /** Left aligned header text */
    var headerLeft: js.UndefOr[String] = js.native
    
    /** Display line above the header */
    var headerLine: js.UndefOr[Boolean] = js.native
    
    /** Right aligned header text */
    var headerRight: js.UndefOr[String] = js.native
    
    /** Spacing between header and content in mm (e.g 10mm 2cm 0.5in) (default 0) */
    var headerSpacing: js.UndefOr[String] = js.native
    
    /** Ignore warnings */
    var ignore: js.UndefOr[js.Array[String | js.RegExp]] = js.native
    
    /** When embedding images scale them down to this dpi (default 600) */
    var imageDpi: js.UndefOr[Double] = js.native
    
    /** When jpeg compressing images use this quality (default 94) */
    var imageQuality: js.UndefOr[Double] = js.native
    
    /** Do load or print images (default) */
    var images: js.UndefOr[Boolean] = js.native
    
    /** Include the page in the table of contents and outlines (default) */
    var includeInOutline: js.UndefOr[Boolean] = js.native
    
    /** Wait some milliseconds for javascript finish (default 200) */
    var javascriptDelay: js.UndefOr[Double] = js.native
    
    /** Keep relative external links as relative external links */
    var keepRelativeLinks: js.UndefOr[Boolean] = js.native
    
    /** Specify how to handle pages that fail to load: abort, ignore or skip (default abort) */
    var loadErrorHandling: js.UndefOr[abort | ignore | skip] = js.native
    
    /** Specify how to handle media files that fail to load: abort, ignore or skip (default ignore) */
    var loadMediaErrorHandling: js.UndefOr[abort | ignore | skip] = js.native
    
    /** Set log level (default info) */
    var logLevel: js.UndefOr[none | error | warn | info] = js.native
    
    /** Generates lower quality pdf/ps. Useful to shrink the result document space */
    var lowquality: js.UndefOr[Boolean] = js.native
    
    /** Set the page bottom margin in unitreal (e.g 10mm 2cm 0.5in) */
    var marginBottom: js.UndefOr[String] = js.native
    
    /** Set the page left margin in unitreal (e.g 10mm 2cm 0.5in) (default 10mm) */
    var marginLeft: js.UndefOr[String] = js.native
    
    /** Set the page right margin in unitreal (e.g 10mm 2cm 0.5in) (default 10mm) */
    var marginRight: js.UndefOr[String] = js.native
    
    /** Set the page top margin in unitreal (e.g 10mm 2cm 0.5in) */
    var marginTop: js.UndefOr[String] = js.native
    
    /** Minimum font size */
    var minimumFontSize: js.UndefOr[Double] = js.native
    
    /** Do not print background */
    var noBackground: js.UndefOr[Boolean] = js.native
    
    /** Do not collate when printing multiple copies */
    var noCollate: js.UndefOr[Boolean] = js.native
    
    /** Do not add HTTP headers specified by --custom-header for each resource request. */
    var noCustomHeaderPropagation: js.UndefOr[Boolean] = js.native
    
    /** Do not show javascript debugging output (default) */
    var noDebugJavascript: js.UndefOr[Boolean] = js.native
    
    /** Do not display line above the footer (default) */
    var noFooterLine: js.UndefOr[Boolean] = js.native
    
    /** Do not display line above the header (default) */
    var noHeaderLine: js.UndefOr[Boolean] = js.native
    
    /** Do not load or print images */
    var noImages: js.UndefOr[Boolean] = js.native
    
    /** Do not put an outline into the pdf */
    var noOutline: js.UndefOr[Boolean] = js.native
    
    /** Do not use lossless compression on pdf objects */
    var noPdfCompression: js.UndefOr[Boolean] = js.native
    
    /** Do not use print media-type instead of screen (default) */
    var noPrintMediaType: js.UndefOr[Boolean] = js.native
    
    /** Do not Stop slow running javascripts */
    var noStopSlowScripts: js.UndefOr[Boolean] = js.native
    
    /** Set orientation to Landscape or Portrait (default Portrait) */
    var orientation: js.UndefOr[Landscape | Portrait] = js.native
    
    /** Put an outline into the pdf (default) */
    var outline: js.UndefOr[Boolean] = js.native
    
    /** Set the depth of the outline (default 4) */
    var outlineDepth: js.UndefOr[Boolean] = js.native
    
    /** Page object */
    var page: js.UndefOr[String] = js.native
    
    /** Page height in unitreal (e.g 10mm 2cm 0.5in) */
    var pageHeight: js.UndefOr[String] = js.native
    
    /** Set the starting page number (default 0) */
    var pageOffset: js.UndefOr[Double] = js.native
    
    /** Set paper size to: A4, Letter, etc. (default A4) */
    var pageSize: js.UndefOr[
        A0 | A1 | A2 | A3 | A4 | A5 | A6 | A7 | A8 | A9 | B0 | B1 | B10 | B2 | B3 | B4 | B5 | B6 | B7 | B8 | B9 | C5E | Comm10E | DLE | Executive | Folio | Ledger | Legal | Letter | Tabloid
      ] = js.native
    
    /** Page width in unitreal (e.g 10mm 2cm 0.5in) */
    var pageWidth: js.UndefOr[String] = js.native
    
    /** HTTP Authentication password */
    var password: js.UndefOr[String] = js.native
    
    /** Add an additional post field */
    var post: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.native
    
    /** Post an additional file (repeatable) */
    var postFile: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.native
    
    /** Use print media-type instead of screen */
    var printMediaType: js.UndefOr[Boolean] = js.native
    
    /** Use a proxy */
    var proxy: js.UndefOr[String] = js.native
    
    /** Use the proxy for resolving hostnames */
    var proxyHostnameLookup: js.UndefOr[Boolean] = js.native
    
    /** Use this SVG file when rendering checked radiobuttons */
    var radiobuttonCheckedSvg: js.UndefOr[String] = js.native
    
    /** Use this SVG file when rendering unchecked radiobuttons */
    var radiobuttonSvg: js.UndefOr[String] = js.native
    
    /** Replace [name] with value in header and footer (repeatable) */
    var replace: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.native
    
    /** Resolve relative external links into absolute links (default) */
    var resolveRelativeLinks: js.UndefOr[Boolean] = js.native
    
    /** Run this additional javascript after the page is done loading (repeatable) */
    var runScript: js.UndefOr[js.Array[String]] = js.native
    
    /** Path to the ssl client cert public key in OpenSSL PEM format, optionally followed by intermediate ca and trusted certs */
    var sslCrtPath: js.UndefOr[String] = js.native
    
    /** Password to ssl client cert private key */
    var sslKeyPassword: js.UndefOr[String] = js.native
    
    /** Path to ssl client cert private key in OpenSSL PEM format */
    var sslKeyPath: js.UndefOr[String] = js.native
    
    /** Stop slow running javascripts (default) */
    var stopSlowScripts: js.UndefOr[Boolean] = js.native
    
    /** The title of the generated pdf file (The title of the first document is used if not specified) */
    var title: js.UndefOr[String] = js.native
    
    /** TOC object */
    var toc: js.UndefOr[String] = js.native
    
    /** The header text of the toc (default Table of Contents) */
    var tocHeaderText: js.UndefOr[String] = js.native
    
    /** For each level of headings in the toc indent by this length (default 1em) */
    var tocLevelIndentation: js.UndefOr[String] = js.native
    
    /** For each level of headings in the toc the font is scaled by this factor (default 0.8) */
    var tocTextSizeShrink: js.UndefOr[Double] = js.native
    
    /** Specify a user style sheet, to load with every page */
    var userStyleSheet: js.UndefOr[String] = js.native
    
    /** HTTP Authentication username */
    var username: js.UndefOr[String] = js.native
    
    /**
      * Set viewport size if you have custom scrollbars or css attribute overflow to emulate window size
      * Format "1280x1024"
      */
    var viewportSize: js.UndefOr[String] = js.native
    
    /** Wait until window.status is equal to this string before rendering page */
    var windowStatus: js.UndefOr[String] = js.native
    
    /** Use the supplied xsl style sheet for printing the table of contents */
    var xslStyleSheet: js.UndefOr[String] = js.native
    
    /** Use this zoom factor (default 1) */
    var zoom: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllow(value: js.Array[String]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      @scala.inline
      def setAllowVarargs(value: String*): Self = StObject.set(x, "allow", js.Array(value :_*))
      
      @scala.inline
      def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBypassProxyFor(value: js.Array[String]): Self = StObject.set(x, "bypassProxyFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBypassProxyForUndefined: Self = StObject.set(x, "bypassProxyFor", js.undefined)
      
      @scala.inline
      def setBypassProxyForVarargs(value: String*): Self = StObject.set(x, "bypassProxyFor", js.Array(value :_*))
      
      @scala.inline
      def setCacheDir(value: String): Self = StObject.set(x, "cacheDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheDirUndefined: Self = StObject.set(x, "cacheDir", js.undefined)
      
      @scala.inline
      def setCheckboxCheckedSvg(value: String): Self = StObject.set(x, "checkboxCheckedSvg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxCheckedSvgUndefined: Self = StObject.set(x, "checkboxCheckedSvg", js.undefined)
      
      @scala.inline
      def setCheckboxSvg(value: String): Self = StObject.set(x, "checkboxSvg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxSvgUndefined: Self = StObject.set(x, "checkboxSvg", js.undefined)
      
      @scala.inline
      def setCollate(value: Boolean): Self = StObject.set(x, "collate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollateUndefined: Self = StObject.set(x, "collate", js.undefined)
      
      @scala.inline
      def setCookie(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setCookieVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "cookie", js.Array(value :_*))
      
      @scala.inline
      def setCopies(value: Double): Self = StObject.set(x, "copies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopiesUndefined: Self = StObject.set(x, "copies", js.undefined)
      
      @scala.inline
      def setCover(value: String): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
      
      @scala.inline
      def setCustomHeader(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "customHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeaderPropagation(value: Boolean): Self = StObject.set(x, "customHeaderPropagation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeaderPropagationUndefined: Self = StObject.set(x, "customHeaderPropagation", js.undefined)
      
      @scala.inline
      def setCustomHeaderUndefined: Self = StObject.set(x, "customHeader", js.undefined)
      
      @scala.inline
      def setCustomHeaderVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "customHeader", js.Array(value :_*))
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugJavascript(value: Boolean): Self = StObject.set(x, "debugJavascript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugJavascriptUndefined: Self = StObject.set(x, "debugJavascript", js.undefined)
      
      @scala.inline
      def setDebugStdOut(value: Boolean): Self = StObject.set(x, "debugStdOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugStdOutUndefined: Self = StObject.set(x, "debugStdOut", js.undefined)
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDefaultHeader(value: Boolean): Self = StObject.set(x, "defaultHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultHeaderUndefined: Self = StObject.set(x, "defaultHeader", js.undefined)
      
      @scala.inline
      def setDisableDottedLines(value: Boolean): Self = StObject.set(x, "disableDottedLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDottedLinesUndefined: Self = StObject.set(x, "disableDottedLines", js.undefined)
      
      @scala.inline
      def setDisableExternalLinks(value: Boolean): Self = StObject.set(x, "disableExternalLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableExternalLinksUndefined: Self = StObject.set(x, "disableExternalLinks", js.undefined)
      
      @scala.inline
      def setDisableForms(value: Boolean): Self = StObject.set(x, "disableForms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFormsUndefined: Self = StObject.set(x, "disableForms", js.undefined)
      
      @scala.inline
      def setDisableInternalLinks(value: Boolean): Self = StObject.set(x, "disableInternalLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableInternalLinksUndefined: Self = StObject.set(x, "disableInternalLinks", js.undefined)
      
      @scala.inline
      def setDisableJavascript(value: Boolean): Self = StObject.set(x, "disableJavascript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableJavascriptUndefined: Self = StObject.set(x, "disableJavascript", js.undefined)
      
      @scala.inline
      def setDisableLocalFileAccess(value: Boolean): Self = StObject.set(x, "disableLocalFileAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableLocalFileAccessUndefined: Self = StObject.set(x, "disableLocalFileAccess", js.undefined)
      
      @scala.inline
      def setDisablePlugins(value: Boolean): Self = StObject.set(x, "disablePlugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePluginsUndefined: Self = StObject.set(x, "disablePlugins", js.undefined)
      
      @scala.inline
      def setDisableSmartShrinking(value: Boolean): Self = StObject.set(x, "disableSmartShrinking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSmartShrinkingUndefined: Self = StObject.set(x, "disableSmartShrinking", js.undefined)
      
      @scala.inline
      def setDisableTocBackLinks(value: Boolean): Self = StObject.set(x, "disableTocBackLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTocBackLinksUndefined: Self = StObject.set(x, "disableTocBackLinks", js.undefined)
      
      @scala.inline
      def setDisableTocLinks(value: Boolean): Self = StObject.set(x, "disableTocLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTocLinksUndefined: Self = StObject.set(x, "disableTocLinks", js.undefined)
      
      @scala.inline
      def setDpi(value: Double): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
      
      @scala.inline
      def setDumpDefaultTocXsl(value: Boolean): Self = StObject.set(x, "dumpDefaultTocXsl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDumpDefaultTocXslUndefined: Self = StObject.set(x, "dumpDefaultTocXsl", js.undefined)
      
      @scala.inline
      def setDumpOutline(value: String): Self = StObject.set(x, "dumpOutline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDumpOutlineUndefined: Self = StObject.set(x, "dumpOutline", js.undefined)
      
      @scala.inline
      def setEnableExternalLinks(value: Boolean): Self = StObject.set(x, "enableExternalLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableExternalLinksUndefined: Self = StObject.set(x, "enableExternalLinks", js.undefined)
      
      @scala.inline
      def setEnableForms(value: Boolean): Self = StObject.set(x, "enableForms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableFormsUndefined: Self = StObject.set(x, "enableForms", js.undefined)
      
      @scala.inline
      def setEnableInternalLinks(value: Boolean): Self = StObject.set(x, "enableInternalLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableInternalLinksUndefined: Self = StObject.set(x, "enableInternalLinks", js.undefined)
      
      @scala.inline
      def setEnableJavascript(value: Boolean): Self = StObject.set(x, "enableJavascript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableJavascriptUndefined: Self = StObject.set(x, "enableJavascript", js.undefined)
      
      @scala.inline
      def setEnableLocalFileAccess(value: Boolean): Self = StObject.set(x, "enableLocalFileAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableLocalFileAccessUndefined: Self = StObject.set(x, "enableLocalFileAccess", js.undefined)
      
      @scala.inline
      def setEnablePlugins(value: Boolean): Self = StObject.set(x, "enablePlugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePluginsUndefined: Self = StObject.set(x, "enablePlugins", js.undefined)
      
      @scala.inline
      def setEnableSmartShrinking(value: Boolean): Self = StObject.set(x, "enableSmartShrinking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSmartShrinkingUndefined: Self = StObject.set(x, "enableSmartShrinking", js.undefined)
      
      @scala.inline
      def setEnableTocBackLinks(value: Boolean): Self = StObject.set(x, "enableTocBackLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTocBackLinksUndefined: Self = StObject.set(x, "enableTocBackLinks", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setExcludeFromOutline(value: Boolean): Self = StObject.set(x, "excludeFromOutline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeFromOutlineUndefined: Self = StObject.set(x, "excludeFromOutline", js.undefined)
      
      @scala.inline
      def setFooterCenter(value: String): Self = StObject.set(x, "footerCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterCenterUndefined: Self = StObject.set(x, "footerCenter", js.undefined)
      
      @scala.inline
      def setFooterFontName(value: String): Self = StObject.set(x, "footerFontName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterFontNameUndefined: Self = StObject.set(x, "footerFontName", js.undefined)
      
      @scala.inline
      def setFooterFontSize(value: Double): Self = StObject.set(x, "footerFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterFontSizeUndefined: Self = StObject.set(x, "footerFontSize", js.undefined)
      
      @scala.inline
      def setFooterHtml(value: String): Self = StObject.set(x, "footerHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterHtmlUndefined: Self = StObject.set(x, "footerHtml", js.undefined)
      
      @scala.inline
      def setFooterLeft(value: String): Self = StObject.set(x, "footerLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterLeftUndefined: Self = StObject.set(x, "footerLeft", js.undefined)
      
      @scala.inline
      def setFooterLine(value: Boolean): Self = StObject.set(x, "footerLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterLineUndefined: Self = StObject.set(x, "footerLine", js.undefined)
      
      @scala.inline
      def setFooterRight(value: String): Self = StObject.set(x, "footerRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterRightUndefined: Self = StObject.set(x, "footerRight", js.undefined)
      
      @scala.inline
      def setFooterSpacing(value: String): Self = StObject.set(x, "footerSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterSpacingUndefined: Self = StObject.set(x, "footerSpacing", js.undefined)
      
      @scala.inline
      def setGrayscale(value: Boolean): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrayscaleUndefined: Self = StObject.set(x, "grayscale", js.undefined)
      
      @scala.inline
      def setHeaderCenter(value: String): Self = StObject.set(x, "headerCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderCenterUndefined: Self = StObject.set(x, "headerCenter", js.undefined)
      
      @scala.inline
      def setHeaderFontName(value: String): Self = StObject.set(x, "headerFontName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFontNameUndefined: Self = StObject.set(x, "headerFontName", js.undefined)
      
      @scala.inline
      def setHeaderFontSize(value: Double): Self = StObject.set(x, "headerFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFontSizeUndefined: Self = StObject.set(x, "headerFontSize", js.undefined)
      
      @scala.inline
      def setHeaderHtml(value: String): Self = StObject.set(x, "headerHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHtmlUndefined: Self = StObject.set(x, "headerHtml", js.undefined)
      
      @scala.inline
      def setHeaderLeft(value: String): Self = StObject.set(x, "headerLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderLeftUndefined: Self = StObject.set(x, "headerLeft", js.undefined)
      
      @scala.inline
      def setHeaderLine(value: Boolean): Self = StObject.set(x, "headerLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderLineUndefined: Self = StObject.set(x, "headerLine", js.undefined)
      
      @scala.inline
      def setHeaderRight(value: String): Self = StObject.set(x, "headerRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderRightUndefined: Self = StObject.set(x, "headerRight", js.undefined)
      
      @scala.inline
      def setHeaderSpacing(value: String): Self = StObject.set(x, "headerSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderSpacingUndefined: Self = StObject.set(x, "headerSpacing", js.undefined)
      
      @scala.inline
      def setIgnore(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setImageDpi(value: Double): Self = StObject.set(x, "imageDpi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageDpiUndefined: Self = StObject.set(x, "imageDpi", js.undefined)
      
      @scala.inline
      def setImageQuality(value: Double): Self = StObject.set(x, "imageQuality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageQualityUndefined: Self = StObject.set(x, "imageQuality", js.undefined)
      
      @scala.inline
      def setImages(value: Boolean): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      @scala.inline
      def setIncludeInOutline(value: Boolean): Self = StObject.set(x, "includeInOutline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeInOutlineUndefined: Self = StObject.set(x, "includeInOutline", js.undefined)
      
      @scala.inline
      def setJavascriptDelay(value: Double): Self = StObject.set(x, "javascriptDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJavascriptDelayUndefined: Self = StObject.set(x, "javascriptDelay", js.undefined)
      
      @scala.inline
      def setKeepRelativeLinks(value: Boolean): Self = StObject.set(x, "keepRelativeLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepRelativeLinksUndefined: Self = StObject.set(x, "keepRelativeLinks", js.undefined)
      
      @scala.inline
      def setLoadErrorHandling(value: abort | ignore | skip): Self = StObject.set(x, "loadErrorHandling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadErrorHandlingUndefined: Self = StObject.set(x, "loadErrorHandling", js.undefined)
      
      @scala.inline
      def setLoadMediaErrorHandling(value: abort | ignore | skip): Self = StObject.set(x, "loadMediaErrorHandling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadMediaErrorHandlingUndefined: Self = StObject.set(x, "loadMediaErrorHandling", js.undefined)
      
      @scala.inline
      def setLogLevel(value: none | error | warn | info): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setLowquality(value: Boolean): Self = StObject.set(x, "lowquality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowqualityUndefined: Self = StObject.set(x, "lowquality", js.undefined)
      
      @scala.inline
      def setMarginBottom(value: String): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      @scala.inline
      def setMarginLeft(value: String): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      @scala.inline
      def setMarginRight(value: String): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      @scala.inline
      def setMarginTop(value: String): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      @scala.inline
      def setMinimumFontSize(value: Double): Self = StObject.set(x, "minimumFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumFontSizeUndefined: Self = StObject.set(x, "minimumFontSize", js.undefined)
      
      @scala.inline
      def setNoBackground(value: Boolean): Self = StObject.set(x, "noBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoBackgroundUndefined: Self = StObject.set(x, "noBackground", js.undefined)
      
      @scala.inline
      def setNoCollate(value: Boolean): Self = StObject.set(x, "noCollate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoCollateUndefined: Self = StObject.set(x, "noCollate", js.undefined)
      
      @scala.inline
      def setNoCustomHeaderPropagation(value: Boolean): Self = StObject.set(x, "noCustomHeaderPropagation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoCustomHeaderPropagationUndefined: Self = StObject.set(x, "noCustomHeaderPropagation", js.undefined)
      
      @scala.inline
      def setNoDebugJavascript(value: Boolean): Self = StObject.set(x, "noDebugJavascript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDebugJavascriptUndefined: Self = StObject.set(x, "noDebugJavascript", js.undefined)
      
      @scala.inline
      def setNoFooterLine(value: Boolean): Self = StObject.set(x, "noFooterLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoFooterLineUndefined: Self = StObject.set(x, "noFooterLine", js.undefined)
      
      @scala.inline
      def setNoHeaderLine(value: Boolean): Self = StObject.set(x, "noHeaderLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoHeaderLineUndefined: Self = StObject.set(x, "noHeaderLine", js.undefined)
      
      @scala.inline
      def setNoImages(value: Boolean): Self = StObject.set(x, "noImages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoImagesUndefined: Self = StObject.set(x, "noImages", js.undefined)
      
      @scala.inline
      def setNoOutline(value: Boolean): Self = StObject.set(x, "noOutline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoOutlineUndefined: Self = StObject.set(x, "noOutline", js.undefined)
      
      @scala.inline
      def setNoPdfCompression(value: Boolean): Self = StObject.set(x, "noPdfCompression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoPdfCompressionUndefined: Self = StObject.set(x, "noPdfCompression", js.undefined)
      
      @scala.inline
      def setNoPrintMediaType(value: Boolean): Self = StObject.set(x, "noPrintMediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoPrintMediaTypeUndefined: Self = StObject.set(x, "noPrintMediaType", js.undefined)
      
      @scala.inline
      def setNoStopSlowScripts(value: Boolean): Self = StObject.set(x, "noStopSlowScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoStopSlowScriptsUndefined: Self = StObject.set(x, "noStopSlowScripts", js.undefined)
      
      @scala.inline
      def setOrientation(value: Landscape | Portrait): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineDepth(value: Boolean): Self = StObject.set(x, "outlineDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineDepthUndefined: Self = StObject.set(x, "outlineDepth", js.undefined)
      
      @scala.inline
      def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      @scala.inline
      def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageHeight(value: String): Self = StObject.set(x, "pageHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageHeightUndefined: Self = StObject.set(x, "pageHeight", js.undefined)
      
      @scala.inline
      def setPageOffset(value: Double): Self = StObject.set(x, "pageOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOffsetUndefined: Self = StObject.set(x, "pageOffset", js.undefined)
      
      @scala.inline
      def setPageSize(
        value: A0 | A1 | A2 | A3 | A4 | A5 | A6 | A7 | A8 | A9 | B0 | B1 | B10 | B2 | B3 | B4 | B5 | B6 | B7 | B8 | B9 | C5E | Comm10E | DLE | Executive | Folio | Ledger | Legal | Letter | Tabloid
      ): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setPageWidth(value: String): Self = StObject.set(x, "pageWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageWidthUndefined: Self = StObject.set(x, "pageWidth", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPost(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostFile(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "postFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostFileUndefined: Self = StObject.set(x, "postFile", js.undefined)
      
      @scala.inline
      def setPostFileVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "postFile", js.Array(value :_*))
      
      @scala.inline
      def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      @scala.inline
      def setPostVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "post", js.Array(value :_*))
      
      @scala.inline
      def setPrintMediaType(value: Boolean): Self = StObject.set(x, "printMediaType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintMediaTypeUndefined: Self = StObject.set(x, "printMediaType", js.undefined)
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyHostnameLookup(value: Boolean): Self = StObject.set(x, "proxyHostnameLookup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyHostnameLookupUndefined: Self = StObject.set(x, "proxyHostnameLookup", js.undefined)
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setRadiobuttonCheckedSvg(value: String): Self = StObject.set(x, "radiobuttonCheckedSvg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiobuttonCheckedSvgUndefined: Self = StObject.set(x, "radiobuttonCheckedSvg", js.undefined)
      
      @scala.inline
      def setRadiobuttonSvg(value: String): Self = StObject.set(x, "radiobuttonSvg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiobuttonSvgUndefined: Self = StObject.set(x, "radiobuttonSvg", js.undefined)
      
      @scala.inline
      def setReplace(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      @scala.inline
      def setReplaceVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "replace", js.Array(value :_*))
      
      @scala.inline
      def setResolveRelativeLinks(value: Boolean): Self = StObject.set(x, "resolveRelativeLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveRelativeLinksUndefined: Self = StObject.set(x, "resolveRelativeLinks", js.undefined)
      
      @scala.inline
      def setRunScript(value: js.Array[String]): Self = StObject.set(x, "runScript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunScriptUndefined: Self = StObject.set(x, "runScript", js.undefined)
      
      @scala.inline
      def setRunScriptVarargs(value: String*): Self = StObject.set(x, "runScript", js.Array(value :_*))
      
      @scala.inline
      def setSslCrtPath(value: String): Self = StObject.set(x, "sslCrtPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslCrtPathUndefined: Self = StObject.set(x, "sslCrtPath", js.undefined)
      
      @scala.inline
      def setSslKeyPassword(value: String): Self = StObject.set(x, "sslKeyPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslKeyPasswordUndefined: Self = StObject.set(x, "sslKeyPassword", js.undefined)
      
      @scala.inline
      def setSslKeyPath(value: String): Self = StObject.set(x, "sslKeyPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslKeyPathUndefined: Self = StObject.set(x, "sslKeyPath", js.undefined)
      
      @scala.inline
      def setStopSlowScripts(value: Boolean): Self = StObject.set(x, "stopSlowScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopSlowScriptsUndefined: Self = StObject.set(x, "stopSlowScripts", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setToc(value: String): Self = StObject.set(x, "toc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTocHeaderText(value: String): Self = StObject.set(x, "tocHeaderText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTocHeaderTextUndefined: Self = StObject.set(x, "tocHeaderText", js.undefined)
      
      @scala.inline
      def setTocLevelIndentation(value: String): Self = StObject.set(x, "tocLevelIndentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTocLevelIndentationUndefined: Self = StObject.set(x, "tocLevelIndentation", js.undefined)
      
      @scala.inline
      def setTocTextSizeShrink(value: Double): Self = StObject.set(x, "tocTextSizeShrink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTocTextSizeShrinkUndefined: Self = StObject.set(x, "tocTextSizeShrink", js.undefined)
      
      @scala.inline
      def setTocUndefined: Self = StObject.set(x, "toc", js.undefined)
      
      @scala.inline
      def setUserStyleSheet(value: String): Self = StObject.set(x, "userStyleSheet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserStyleSheetUndefined: Self = StObject.set(x, "userStyleSheet", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      @scala.inline
      def setViewportSize(value: String): Self = StObject.set(x, "viewportSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportSizeUndefined: Self = StObject.set(x, "viewportSize", js.undefined)
      
      @scala.inline
      def setWindowStatus(value: String): Self = StObject.set(x, "windowStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowStatusUndefined: Self = StObject.set(x, "windowStatus", js.undefined)
      
      @scala.inline
      def setXslStyleSheet(value: String): Self = StObject.set(x, "xslStyleSheet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXslStyleSheetUndefined: Self = StObject.set(x, "xslStyleSheet", js.undefined)
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  @js.native
  trait OptionsOutfile extends Options {
    
    /** If defined only output to this path */
    var output: String = js.native
  }
  object OptionsOutfile {
    
    @scala.inline
    def apply(output: String): OptionsOutfile = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsOutfile]
    }
    
    @scala.inline
    implicit class OptionsOutfileMutableBuilder[Self <: OptionsOutfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
}
