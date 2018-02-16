def call(nodeName, librariesPaths, body) {
	node(nodeName) {
		body()
	}
}

return this
