package typingsSlinky.webpackDevServer

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.connectHistoryApiFallback.mod.Options
import typingsSlinky.express.mod.Application_
import typingsSlinky.httpProxyMiddleware.mod.Config
import typingsSlinky.httpProxyMiddleware.mod.Filter
import typingsSlinky.httpProxyMiddleware.mod.LogProvider
import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.ClientRequest
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.httpsMod.ServerOptions
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.tlsMod.TlsOptions
import typingsSlinky.serveStatic.mod.ServeStaticOptions
import typingsSlinky.webpackDevServer.anon.Client
import typingsSlinky.webpackDevServer.anon.ClientServer
import typingsSlinky.webpackDevServer.anon.Errors
import typingsSlinky.webpackDevServer.anon.Port
import typingsSlinky.webpackDevServer.anon.Server
import typingsSlinky.webpackDevServer.anon.TypeMap
import typingsSlinky.webpackDevServer.webpackDevServerBooleans.`false`
import typingsSlinky.webpackDevServer.webpackDevServerStrings.debug
import typingsSlinky.webpackDevServer.webpackDevServerStrings.error
import typingsSlinky.webpackDevServer.webpackDevServerStrings.info
import typingsSlinky.webpackDevServer.webpackDevServerStrings.none
import typingsSlinky.webpackDevServer.webpackDevServerStrings.silent
import typingsSlinky.webpackDevServer.webpackDevServerStrings.sockjs
import typingsSlinky.webpackDevServer.webpackDevServerStrings.trace
import typingsSlinky.webpackDevServer.webpackDevServerStrings.warn
import typingsSlinky.webpackDevServer.webpackDevServerStrings.warning
import typingsSlinky.webpackDevServer.webpackDevServerStrings.ws
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-dev-server", JSImport.Namespace)
  @js.native
  class ^ protected () extends WebpackDevServer {
    def this(webpack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any) = this()
    def this(
      webpack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
      config: Configuration
    ) = this()
  }
  
  /* static member */
  @JSImport("webpack-dev-server", "addDevServerEntrypoints")
  @js.native
  def addDevServerEntrypoints(
    webpackOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any,
    config: Configuration
  ): Unit = js.native
  @JSImport("webpack-dev-server", "addDevServerEntrypoints")
  @js.native
  def addDevServerEntrypoints(
    webpackOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any,
    config: Configuration,
    listeningApp: ListeningApp
  ): Unit = js.native
  @JSImport("webpack-dev-server", "addDevServerEntrypoints")
  @js.native
  def addDevServerEntrypoints(
    webpackOptions: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ _
    ],
    config: Configuration
  ): Unit = js.native
  @JSImport("webpack-dev-server", "addDevServerEntrypoints")
  @js.native
  def addDevServerEntrypoints(
    webpackOptions: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ _
    ],
    config: Configuration,
    listeningApp: ListeningApp
  ): Unit = js.native
  
  @js.native
  trait Configuration extends StObject {
    
    /**
      * Provides the ability to execute custom middleware after all other
      * middleware internally within the server.
      */
    var after: js.UndefOr[
        js.Function3[
          /* app */ Application_, 
          /* server */ WebpackDevServer, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, 
          Unit
        ]
      ] = js.native
    
    /**
      * This option allows you to whitelist services that are allowed to
      * access the dev server.
      */
    var allowedHosts: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Provides the ability to execute custom middleware prior to all
      * other middleware internally within the server.
      */
    var before: js.UndefOr[
        js.Function3[
          /* app */ Application_, 
          /* server */ WebpackDevServer, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, 
          Unit
        ]
      ] = js.native
    
    /**
      * This option broadcasts the server via ZeroConf networking on start.
      */
    var bonjour: js.UndefOr[Boolean] = js.native
    
    /**
      * When using inline mode, the console in your DevTools will show you
      * messages e.g. before reloading, before an error or when Hot Module
      * Replacement is enabled. This may be too verbose.
      *
      * 'none' and 'warning' are going to be deprecated at the next major
      * version.
      */
    var clientLogLevel: js.UndefOr[silent | trace | debug | info | warn | error | none | warning] = js.native
    
    /**
      * Enable gzip compression for everything served.
      */
    var compress: js.UndefOr[Boolean] = js.native
    
    /**
      * Tell the server where to serve content from. This is only necessary
      * if you want to serve static files. devServer.publicPath will be used
      * to determine where the bundles should be served from, and takes
      * precedence.
      */
    var contentBase: js.UndefOr[Boolean | String | js.Array[String] | Double] = js.native
    
    /**
      * Tell the server at what URL to serve `devServer.contentBase`.
      * If there was a file `assets/manifest.json`,
      * it would be served at `/serve-content-base-at-this-url/manifest.json`
      */
    var contentBasePublicPath: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * When set to true this option bypasses host checking.  THIS IS NOT
      * RECOMMENDED as apps that do not check the host are vulnerable to DNS
      * rebinding attacks.
      */
    var disableHostCheck: js.UndefOr[Boolean] = js.native
    
    /**
      * This option lets you reduce the compilations in lazy mode.
      * By default in lazy mode, every request results in a new compilation.
      * With filename, it's possible to only compile when a certain file is requested.
      */
    var filename: js.UndefOr[String] = js.native
    
    /** Adds headers to all responses. */
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * When using the HTML5 History API, the index.html page will likely
      * have to be served in place of any 404 responses.
      */
    var historyApiFallback: js.UndefOr[Boolean | Options] = js.native
    
    /**
      * Specify a host to use. By default this is localhost.
      */
    var host: js.UndefOr[String] = js.native
    
    /**
      * Enable webpack's Hot Module Replacement feature.
      * Note that webpack.HotModuleReplacementPlugin is required to fully
      * enable HMR. If webpack or webpack-dev-server are launched with the
      * --hot option, this plugin will be added automatically, so you may
      * not need to add this to your webpack.config.js.
      */
    var hot: js.UndefOr[Boolean] = js.native
    
    /**
      * Enables Hot Module Replacement (see devServer.hot) without page
      * refresh as fallback in case of build failures.
      */
    var hotOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * Serve over HTTP/2 using spdy. This option is ignored for Node 10.0.0
      * and above, as spdy is broken for those versions. The dev server will
      * migrate over to Node's built-in HTTP/2 once Express supports it.
      */
    var http2: js.UndefOr[Boolean] = js.native
    
    /**
      * By default dev-server will be served over HTTP. It can optionally be
      * served over HTTP/2 with HTTPS.
      */
    var https: js.UndefOr[Boolean | ServerOptions] = js.native
    
    /**
      * The filename that is considered the index file.
      */
    var index: js.UndefOr[String] = js.native
    
    /**
      * Tells devServer to inject a client. Setting devServer.injectClient
      * to true will result in always injecting a client. It is possible to
      * provide a function to inject conditionally
      */
    var injectClient: js.UndefOr[
        Boolean | (js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compilerConfig */ js.Any, 
          Boolean
        ])
      ] = js.native
    
    /**
      * Tells devServer to inject a Hot Module Replacement. Setting
      * devServer.injectHot to true will result in always injecting. It is
      * possible to provide a function to inject conditionally
      */
    var injectHot: js.UndefOr[
        Boolean | (js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compilerConfig */ js.Any, 
          Boolean
        ])
      ] = js.native
    
    /**
      * Toggle between the dev-server's two different modes.  By default the
      * application will be served with inline mode enabled.  This means
      * that a script will be inserted in your bundle to take care of live
      * reloading, and build messages will appear in the browser console.
      */
    var `inline`: js.UndefOr[Boolean] = js.native
    
    /**
      * When lazy is enabled, the dev-server will only compile the bundle
      * when it gets requested.  This means that webpack will not watch any
      * file changes.
      */
    var `lazy`: js.UndefOr[Boolean] = js.native
    
    /**
      * By default, the dev-server will reload/refresh the page when file
      * changes are detected. devServer.hot option must be disabled or
      * devServer.watchContentBase option must be enabled in order for
      * liveReload to take effect. Disable devServer.liveReload by setting
      * it to false
      */
    var liveReload: js.UndefOr[Boolean] = js.native
    
    /**
      * The object is passed to the underlying webpack-dev-middleware. See
      * [documentation](https://github.com/webpack/webpack-dev-middleware#mimetypes)
      * for usage notes.
      */
    var mimeTypes: js.UndefOr[StringDictionary[js.Array[String]] | TypeMap] = js.native
    
    /**
      * With noInfo enabled, messages like the webpack bundle information
      * that is shown when starting up and after each save,will be hidden.
      * Errors and warnings will still be shown.
      */
    var noInfo: js.UndefOr[Boolean] = js.native
    
    /**
      * Provides an option to execute a custom function when
      * webpack-dev-server starts listening for connections on a port.
      */
    var onListening: js.UndefOr[js.Function1[/* server */ WebpackDevServer, Unit]] = js.native
    
    /** When open is enabled, the dev server will open the browser. */
    var open: js.UndefOr[Boolean | String | js.Object] = js.native
    
    /** Specify a page to navigate to when opening the browser. */
    var openPage: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * Shows a full-screen overlay in the browser when there are compiler
      * errors or warnings. Disabled by default.
      */
    var overlay: js.UndefOr[Boolean | Errors] = js.native
    
    /**
      * When used via the CLI, a path to an SSL .pfx file. If used in
      * options, it should be the bytestream of the .pfx file.
      */
    var pfx: js.UndefOr[String] = js.native
    
    /** The passphrase to a SSL PFX file. */
    var pfxPassphrase: js.UndefOr[String] = js.native
    
    /** Specify a port number to listen for requests on. */
    var port: js.UndefOr[Double] = js.native
    
    /**
      * Proxying some URLs can be useful when you have a separate API
      * backend development server and you want to send API requests on the
      * same domain.
      *
      * The dev-server makes use of the powerful http-proxy-middleware
      * package. Check out its
      * [documentation](https://github.com/chimurai/http-proxy-middleware#options)
      * for more advanced usages. Note that some of http-proxy-middleware's
      * features do not require a target key, e.g. its router feature, but
      * you will still need to include a target key in your config here,
      * otherwise webpack-dev-server won't pass it along to
      * http-proxy-middleware).
      */
    var proxy: js.UndefOr[ProxyConfigMap | ProxyConfigArray] = js.native
    
    /**
      * When using inline mode and you're proxying dev-server, the inline
      * client script does not always know where to connect to.  It will try
      * to guess the URL of the server based on window.location, but if that
      * fails you'll need to use this.
      */
    var public: js.UndefOr[String] = js.native
    
    /**
      * The bundled files will be available in the browser under this path.
      * default is '/'
      */
    var publicPath: js.UndefOr[String] = js.native
    
    /**
      * With quiet enabled, nothing except the initial startup information
      * will be written to the console.  This also means that errors or
      * warnings from webpack are not visible.
      */
    var quiet: js.UndefOr[Boolean] = js.native
    
    /**
      * Tells dev-server to use serveIndex middleware when enabled.
      *
      * serveIndex middleware generates directory listings on viewing
      * directories that don't have an index.html file.
      */
    var serveIndex: js.UndefOr[Boolean] = js.native
    
    /**
      * @deprecated This option is deprecated in favor of devServer.before
      * and will be removed in v3.0.0. Here you can access the Express app
      * object and add your own custom middleware to it.
      */
    var setup: js.UndefOr[js.Function2[/* app */ Application_, /* server */ WebpackDevServer, Unit]] = js.native
    
    /**
      * Tells clients connected to devServer to use provided socket host.
      */
    var sockHost: js.UndefOr[String] = js.native
    
    /**
      * The path at which to connect to the reloading socket. Default is
      * '/sockjs-node'
      */
    var sockPath: js.UndefOr[String] = js.native
    
    /**
      * Tells clients connected to devServer to use provided socket port.
      */
    var sockPort: js.UndefOr[String | Double] = js.native
    
    /** The Unix socket to listen to (instead of a host). */
    var socket: js.UndefOr[String] = js.native
    
    /**
      * It is possible to configure advanced options for serving static
      * files from contentBase.
      *
      * This only works when using devServer.contentBase as a string.
      */
    var staticOptions: js.UndefOr[ServeStaticOptions[ServerResponse]] = js.native
    
    /**
      * This option lets you precisely control what bundle information gets
      * displayed.  This can be a nice middle ground if you want some bundle
      * information, but not all of it.
      */
    var stats: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration * / any['stats'] */ js.Any
      ] = js.native
    
    /**
      * transportMode is an experimental option, meaning its usage could
      * potentially change without warning.
      *
      * Providing a string to devServer.transportMode is a shortcut to
      * setting both devServer.transportMode.client and
      * devServer.transportMode.server to the given string value.
      *
      * This option allows us either to choose the current devServer
      * transport mode for client/server individually or to provide custom
      * client/server implementation. This allows to specify how browser or
      * other client communicates with the devServer.
      *
      * The current default mode is 'sockjs'. This mode uses SockJS-node as
      * a server, and SockJS-client on the client.
      *
      * 'ws' mode will become the default mode in the next major devServer
      * version. This mode uses ws as a server, and native WebSockets on the
      * client.
      */
    var transportMode: js.UndefOr[sockjs | ws | Client | Server | ClientServer] = js.native
    
    /** This option lets the browser open with your local IP. */
    var useLocalIp: js.UndefOr[Boolean] = js.native
    
    /**
      * Tell the server to watch the files served by the
      * devServer.contentBase option. File changes will trigger a full page
      * reload.
      */
    var watchContentBase: js.UndefOr[Boolean] = js.native
    
    /** Control options related to watching the files. */
    var watchOptions: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration * / any['watchOptions'] */ js.Any
      ] = js.native
    
    /** Tells devServer to write generated assets to the disk. */
    var writeToDisk: js.UndefOr[Boolean | (js.Function1[/* filePath */ String, Boolean])] = js.native
  }
  object Configuration {
    
    @scala.inline
    def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(
        value: (/* app */ Application_, /* server */ WebpackDevServer, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any) => Unit
      ): Self = StObject.set(x, "after", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setAllowedHosts(value: js.Array[String]): Self = StObject.set(x, "allowedHosts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedHostsUndefined: Self = StObject.set(x, "allowedHosts", js.undefined)
      
      @scala.inline
      def setAllowedHostsVarargs(value: String*): Self = StObject.set(x, "allowedHosts", js.Array(value :_*))
      
      @scala.inline
      def setBefore(
        value: (/* app */ Application_, /* server */ WebpackDevServer, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any) => Unit
      ): Self = StObject.set(x, "before", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setBonjour(value: Boolean): Self = StObject.set(x, "bonjour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBonjourUndefined: Self = StObject.set(x, "bonjour", js.undefined)
      
      @scala.inline
      def setClientLogLevel(value: silent | trace | debug | info | warn | error | none | warning): Self = StObject.set(x, "clientLogLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientLogLevelUndefined: Self = StObject.set(x, "clientLogLevel", js.undefined)
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setContentBase(value: Boolean | String | js.Array[String] | Double): Self = StObject.set(x, "contentBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentBasePublicPath(value: String | js.Array[String]): Self = StObject.set(x, "contentBasePublicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentBasePublicPathUndefined: Self = StObject.set(x, "contentBasePublicPath", js.undefined)
      
      @scala.inline
      def setContentBasePublicPathVarargs(value: String*): Self = StObject.set(x, "contentBasePublicPath", js.Array(value :_*))
      
      @scala.inline
      def setContentBaseUndefined: Self = StObject.set(x, "contentBase", js.undefined)
      
      @scala.inline
      def setContentBaseVarargs(value: String*): Self = StObject.set(x, "contentBase", js.Array(value :_*))
      
      @scala.inline
      def setDisableHostCheck(value: Boolean): Self = StObject.set(x, "disableHostCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableHostCheckUndefined: Self = StObject.set(x, "disableHostCheck", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHistoryApiFallback(value: Boolean | Options): Self = StObject.set(x, "historyApiFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryApiFallbackUndefined: Self = StObject.set(x, "historyApiFallback", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotOnly(value: Boolean): Self = StObject.set(x, "hotOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotOnlyUndefined: Self = StObject.set(x, "hotOnly", js.undefined)
      
      @scala.inline
      def setHotUndefined: Self = StObject.set(x, "hot", js.undefined)
      
      @scala.inline
      def setHttp2(value: Boolean): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
      
      @scala.inline
      def setHttps(value: Boolean | ServerOptions): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setInjectClient(
        value: Boolean | (js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compilerConfig */ js.Any, 
              Boolean
            ])
      ): Self = StObject.set(x, "injectClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectClientFunction1(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compilerConfig */ js.Any => Boolean
      ): Self = StObject.set(x, "injectClient", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInjectClientUndefined: Self = StObject.set(x, "injectClient", js.undefined)
      
      @scala.inline
      def setInjectHot(
        value: Boolean | (js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compilerConfig */ js.Any, 
              Boolean
            ])
      ): Self = StObject.set(x, "injectHot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectHotFunction1(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compilerConfig */ js.Any => Boolean
      ): Self = StObject.set(x, "injectHot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInjectHotUndefined: Self = StObject.set(x, "injectHot", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      @scala.inline
      def setLiveReload(value: Boolean): Self = StObject.set(x, "liveReload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveReloadUndefined: Self = StObject.set(x, "liveReload", js.undefined)
      
      @scala.inline
      def setMimeTypes(value: StringDictionary[js.Array[String]] | TypeMap): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
      
      @scala.inline
      def setNoInfo(value: Boolean): Self = StObject.set(x, "noInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoInfoUndefined: Self = StObject.set(x, "noInfo", js.undefined)
      
      @scala.inline
      def setOnListening(value: /* server */ WebpackDevServer => Unit): Self = StObject.set(x, "onListening", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnListeningUndefined: Self = StObject.set(x, "onListening", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean | String | js.Object): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenPage(value: String | js.Array[String]): Self = StObject.set(x, "openPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenPageUndefined: Self = StObject.set(x, "openPage", js.undefined)
      
      @scala.inline
      def setOpenPageVarargs(value: String*): Self = StObject.set(x, "openPage", js.Array(value :_*))
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOverlay(value: Boolean | Errors): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPfx(value: String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxPassphrase(value: String): Self = StObject.set(x, "pfxPassphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxPassphraseUndefined: Self = StObject.set(x, "pfxPassphrase", js.undefined)
      
      @scala.inline
      def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProxy(value: ProxyConfigMap | ProxyConfigArray): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setProxyVarargs(value: ProxyConfigArrayItem*): Self = StObject.set(x, "proxy", js.Array(value :_*))
      
      @scala.inline
      def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
      
      @scala.inline
      def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setServeIndex(value: Boolean): Self = StObject.set(x, "serveIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServeIndexUndefined: Self = StObject.set(x, "serveIndex", js.undefined)
      
      @scala.inline
      def setSetup(value: (/* app */ Application_, /* server */ WebpackDevServer) => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
      
      @scala.inline
      def setSockHost(value: String): Self = StObject.set(x, "sockHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSockHostUndefined: Self = StObject.set(x, "sockHost", js.undefined)
      
      @scala.inline
      def setSockPath(value: String): Self = StObject.set(x, "sockPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSockPathUndefined: Self = StObject.set(x, "sockPath", js.undefined)
      
      @scala.inline
      def setSockPort(value: String | Double): Self = StObject.set(x, "sockPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSockPortUndefined: Self = StObject.set(x, "sockPort", js.undefined)
      
      @scala.inline
      def setSocket(value: String): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      @scala.inline
      def setStaticOptions(value: ServeStaticOptions[ServerResponse]): Self = StObject.set(x, "staticOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticOptionsUndefined: Self = StObject.set(x, "staticOptions", js.undefined)
      
      @scala.inline
      def setStats(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration * / any['stats'] */ js.Any
      ): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      @scala.inline
      def setTransportMode(value: sockjs | ws | Client | Server | ClientServer): Self = StObject.set(x, "transportMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportModeUndefined: Self = StObject.set(x, "transportMode", js.undefined)
      
      @scala.inline
      def setUseLocalIp(value: Boolean): Self = StObject.set(x, "useLocalIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseLocalIpUndefined: Self = StObject.set(x, "useLocalIp", js.undefined)
      
      @scala.inline
      def setWatchContentBase(value: Boolean): Self = StObject.set(x, "watchContentBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchContentBaseUndefined: Self = StObject.set(x, "watchContentBase", js.undefined)
      
      @scala.inline
      def setWatchOptions(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration * / any['watchOptions'] */ js.Any
      ): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
      
      @scala.inline
      def setWriteToDisk(value: Boolean | (js.Function1[/* filePath */ String, Boolean])): Self = StObject.set(x, "writeToDisk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteToDiskFunction1(value: /* filePath */ String => Boolean): Self = StObject.set(x, "writeToDisk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteToDiskUndefined: Self = StObject.set(x, "writeToDisk", js.undefined)
    }
  }
  
  @js.native
  trait ListeningApp extends StObject {
    
    def address(): Port = js.native
  }
  object ListeningApp {
    
    @scala.inline
    def apply(address: () => Port): ListeningApp = {
      val __obj = js.Dynamic.literal(address = js.Any.fromFunction0(address))
      __obj.asInstanceOf[ListeningApp]
    }
    
    @scala.inline
    implicit class ListeningAppMutableBuilder[Self <: ListeningApp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: () => Port): Self = StObject.set(x, "address", js.Any.fromFunction0(value))
    }
  }
  
  type ProxyConfigArray = js.Array[ProxyConfigArrayItem]
  
  /* Inlined {  path :string | std.Array<string> | undefined,   context :string | std.Array<string> | http-proxy-middleware.http-proxy-middleware.Filter | undefined} & http-proxy-middleware.http-proxy-middleware.Config */
  @js.native
  trait ProxyConfigArrayItem extends StObject {
    
    var agent: js.UndefOr[Agent] = js.native
    
    var auth: js.UndefOr[String] = js.native
    
    var autoRewrite: js.UndefOr[Boolean] = js.native
    
    var buffer: js.UndefOr[Readable] = js.native
    
    var changeOrigin: js.UndefOr[Boolean] = js.native
    
    var context: js.UndefOr[String | js.Array[String] | Filter] = js.native
    
    var cookieDomainRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.native
    
    var cookiePathRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.native
    
    var followRedirects: js.UndefOr[Boolean] = js.native
    
    var forward: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var hostRewrite: js.UndefOr[String] = js.native
    
    var ignorePath: js.UndefOr[Boolean] = js.native
    
    var localAddress: js.UndefOr[String] = js.native
    
    var logLevel: js.UndefOr[debug | info | warn | error | silent] = js.native
    
    var logProvider: js.UndefOr[js.Function1[/* provider */ LogProvider, LogProvider]] = js.native
    
    var onClose: js.UndefOr[
        js.Function3[/* res */ IncomingMessage, /* socket */ Socket, /* head */ js.Any, Unit]
      ] = js.native
    
    var onError: js.UndefOr[
        js.Function3[/* err */ js.Error, /* req */ IncomingMessage, /* res */ ServerResponse, Unit]
      ] = js.native
    
    var onOpen: js.UndefOr[js.Function1[/* proxySocket */ Socket, Unit]] = js.native
    
    var onProxyReq: js.UndefOr[
        js.Function3[
          /* proxyReq */ ClientRequest, 
          /* req */ IncomingMessage, 
          /* res */ ServerResponse, 
          Unit
        ]
      ] = js.native
    
    var onProxyReqWs: js.UndefOr[
        js.Function5[
          /* proxyReq */ ClientRequest, 
          /* req */ IncomingMessage, 
          /* socket */ Socket, 
          /* options */ typingsSlinky.httpProxy.mod.ServerOptions, 
          /* head */ js.Any, 
          Unit
        ]
      ] = js.native
    
    var onProxyRes: js.UndefOr[
        js.Function3[
          /* proxyRes */ IncomingMessage, 
          /* req */ IncomingMessage, 
          /* res */ ServerResponse, 
          Unit
        ]
      ] = js.native
    
    var path: js.UndefOr[String | js.Array[String]] = js.native
    
    var pathRewrite: js.UndefOr[
        StringDictionary[String] | (js.Function2[/* path */ String, /* req */ IncomingMessage, String])
      ] = js.native
    
    var prependPath: js.UndefOr[Boolean] = js.native
    
    var preserveHeaderKeyCase: js.UndefOr[Boolean] = js.native
    
    var protocolRewrite: js.UndefOr[String] = js.native
    
    /**
      * @deprecated
      */
    var proxyHost: js.UndefOr[js.Any] = js.native
    
    /**
      * @deprecated
      */
    var proxyTable: js.UndefOr[js.Any] = js.native
    
    var proxyTimeout: js.UndefOr[Double] = js.native
    
    var router: js.UndefOr[StringDictionary[String] | (js.Function1[/* req */ IncomingMessage, String])] = js.native
    
    var secure: js.UndefOr[Boolean] = js.native
    
    var selfHandleResponse: js.UndefOr[Boolean] = js.native
    
    var ssl: js.UndefOr[TlsOptions] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var toProxy: js.UndefOr[Boolean] = js.native
    
    var ws: js.UndefOr[Boolean] = js.native
    
    var xfwd: js.UndefOr[Boolean] = js.native
  }
  object ProxyConfigArrayItem {
    
    @scala.inline
    def apply(): ProxyConfigArrayItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProxyConfigArrayItem]
    }
    
    @scala.inline
    implicit class ProxyConfigArrayItemMutableBuilder[Self <: ProxyConfigArrayItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setAutoRewrite(value: Boolean): Self = StObject.set(x, "autoRewrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRewriteUndefined: Self = StObject.set(x, "autoRewrite", js.undefined)
      
      @scala.inline
      def setBuffer(value: Readable): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setChangeOrigin(value: Boolean): Self = StObject.set(x, "changeOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeOriginUndefined: Self = StObject.set(x, "changeOrigin", js.undefined)
      
      @scala.inline
      def setContext(value: String | js.Array[String] | Filter): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextFunction2(value: (/* pathname */ String, /* req */ IncomingMessage) => Boolean): Self = StObject.set(x, "context", js.Any.fromFunction2(value))
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setContextVarargs(value: String*): Self = StObject.set(x, "context", js.Array(value :_*))
      
      @scala.inline
      def setCookieDomainRewrite(value: `false` | String | StringDictionary[String]): Self = StObject.set(x, "cookieDomainRewrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieDomainRewriteUndefined: Self = StObject.set(x, "cookieDomainRewrite", js.undefined)
      
      @scala.inline
      def setCookiePathRewrite(value: `false` | String | StringDictionary[String]): Self = StObject.set(x, "cookiePathRewrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiePathRewriteUndefined: Self = StObject.set(x, "cookiePathRewrite", js.undefined)
      
      @scala.inline
      def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      @scala.inline
      def setForward(value: String): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHostRewrite(value: String): Self = StObject.set(x, "hostRewrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostRewriteUndefined: Self = StObject.set(x, "hostRewrite", js.undefined)
      
      @scala.inline
      def setIgnorePath(value: Boolean): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setLogLevel(value: debug | info | warn | error | silent): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setLogProvider(value: /* provider */ LogProvider => LogProvider): Self = StObject.set(x, "logProvider", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogProviderUndefined: Self = StObject.set(x, "logProvider", js.undefined)
      
      @scala.inline
      def setOnClose(value: (/* res */ IncomingMessage, /* socket */ Socket, /* head */ js.Any) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnError(value: (/* err */ js.Error, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnOpen(value: /* proxySocket */ Socket => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOnProxyReq(value: (/* proxyReq */ ClientRequest, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = StObject.set(x, "onProxyReq", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnProxyReqUndefined: Self = StObject.set(x, "onProxyReq", js.undefined)
      
      @scala.inline
      def setOnProxyReqWs(
        value: (/* proxyReq */ ClientRequest, /* req */ IncomingMessage, /* socket */ Socket, /* options */ typingsSlinky.httpProxy.mod.ServerOptions, /* head */ js.Any) => Unit
      ): Self = StObject.set(x, "onProxyReqWs", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnProxyReqWsUndefined: Self = StObject.set(x, "onProxyReqWs", js.undefined)
      
      @scala.inline
      def setOnProxyRes(
        value: (/* proxyRes */ IncomingMessage, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit
      ): Self = StObject.set(x, "onProxyRes", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnProxyResUndefined: Self = StObject.set(x, "onProxyRes", js.undefined)
      
      @scala.inline
      def setPath(value: String | js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathRewrite(
        value: StringDictionary[String] | (js.Function2[/* path */ String, /* req */ IncomingMessage, String])
      ): Self = StObject.set(x, "pathRewrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathRewriteFunction2(value: (/* path */ String, /* req */ IncomingMessage) => String): Self = StObject.set(x, "pathRewrite", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPathRewriteUndefined: Self = StObject.set(x, "pathRewrite", js.undefined)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setPrependPath(value: Boolean): Self = StObject.set(x, "prependPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrependPathUndefined: Self = StObject.set(x, "prependPath", js.undefined)
      
      @scala.inline
      def setPreserveHeaderKeyCase(value: Boolean): Self = StObject.set(x, "preserveHeaderKeyCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveHeaderKeyCaseUndefined: Self = StObject.set(x, "preserveHeaderKeyCase", js.undefined)
      
      @scala.inline
      def setProtocolRewrite(value: String): Self = StObject.set(x, "protocolRewrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolRewriteUndefined: Self = StObject.set(x, "protocolRewrite", js.undefined)
      
      @scala.inline
      def setProxyHost(value: js.Any): Self = StObject.set(x, "proxyHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyHostUndefined: Self = StObject.set(x, "proxyHost", js.undefined)
      
      @scala.inline
      def setProxyTable(value: js.Any): Self = StObject.set(x, "proxyTable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyTableUndefined: Self = StObject.set(x, "proxyTable", js.undefined)
      
      @scala.inline
      def setProxyTimeout(value: Double): Self = StObject.set(x, "proxyTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyTimeoutUndefined: Self = StObject.set(x, "proxyTimeout", js.undefined)
      
      @scala.inline
      def setRouter(value: StringDictionary[String] | (js.Function1[/* req */ IncomingMessage, String])): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouterFunction1(value: /* req */ IncomingMessage => String): Self = StObject.set(x, "router", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setSelfHandleResponse(value: Boolean): Self = StObject.set(x, "selfHandleResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfHandleResponseUndefined: Self = StObject.set(x, "selfHandleResponse", js.undefined)
      
      @scala.inline
      def setSsl(value: TlsOptions): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setToProxy(value: Boolean): Self = StObject.set(x, "toProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToProxyUndefined: Self = StObject.set(x, "toProxy", js.undefined)
      
      @scala.inline
      def setWs(value: Boolean): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsUndefined: Self = StObject.set(x, "ws", js.undefined)
      
      @scala.inline
      def setXfwd(value: Boolean): Self = StObject.set(x, "xfwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXfwdUndefined: Self = StObject.set(x, "xfwd", js.undefined)
    }
  }
  
  type ProxyConfigMap = StringDictionary[String | Config]
  
  @js.native
  trait WebpackDevServer extends StObject {
    
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    def listen(port: Double): typingsSlinky.node.httpMod.Server = js.native
    def listen(port: Double, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): typingsSlinky.node.httpMod.Server = js.native
    def listen(port: Double, hostname: String): typingsSlinky.node.httpMod.Server = js.native
    def listen(port: Double, hostname: String, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): typingsSlinky.node.httpMod.Server = js.native
    
    def sockWrite(sockets: js.Array[EventEmitter], `type`: String): Unit = js.native
    def sockWrite(sockets: js.Array[EventEmitter], `type`: String, data: js.Any): Unit = js.native
    
    var sockets: js.Array[EventEmitter] = js.native
  }
  
  /* augmented module */
  object webpackAugmentingMod {
    
    @js.native
    trait Configuration extends StObject {
      
      /**
        * Can be used to configure the behaviour of webpack-dev-server when
        * the webpack config is passed to webpack-dev-server CLI.
        */
      var devServer: js.UndefOr[typingsSlinky.webpackDevServer.mod.webpackAugmentingMod.Configuration] = js.native
    }
    object Configuration {
      
      @scala.inline
      def apply(): typingsSlinky.webpackDevServer.mod.webpackAugmentingMod.Configuration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsSlinky.webpackDevServer.mod.webpackAugmentingMod.Configuration]
      }
      
      @scala.inline
      implicit class ConfigurationMutableBuilder[Self <: typingsSlinky.webpackDevServer.mod.webpackAugmentingMod.Configuration] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDevServer(value: typingsSlinky.webpackDevServer.mod.webpackAugmentingMod.Configuration): Self = StObject.set(x, "devServer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDevServerUndefined: Self = StObject.set(x, "devServer", js.undefined)
      }
    }
  }
}
