def call(String nodeName, body) {
	node(nodeName) {
		body()
	}
}

return this
