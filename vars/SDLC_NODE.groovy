def call(nodeName, body) {
	node(nodeName) {
		body()
	}
}

return this
